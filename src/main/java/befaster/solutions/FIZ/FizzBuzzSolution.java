package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
       String output = "";
    	if(number > 9999 || number < 1){
    		throw new IllegalArgumentException("Input parameters out of bounds");
    	}
    	if(number%3 == 0 && ("" + number).indexOf('3')!= -1) {
    		if(number % 2 == 0) {
    			output = "fizz deluxe";
    		} else {
    			output = "fizz fake deluxe";
    		}
    	} else if(number%3 == 0 || ("" + number).indexOf('3')!= -1){
    		output = output + "fizz";
    	}
    	if(number%5 == 0 && ("" + number).indexOf('5')!= -1) {
    		
    		if(output.equals("")) {
    			if(number % 2 == 0){
    				output = "buzz deluxe";	
    			} else {
    				output = "buzz fake deluxe";
    			}
    		} else {
    			if(number % 2 == 0){ 
    				output = output + " buzz deluxe";	
    			} else {
    				output = output + " buzz fake deluxe";
    			}
    		}
    	} else if(number%5 == 0 || ("" + number).indexOf('5')!= -1) {
    		if(output.equals("")) {
    			output = "buzz";
    		} else {
    		output = output + " buzz";
    		}
    	}
    	
    	if(output.contains(" fake deluxe")) {
    		output = output.replace(" fake deluxe", "");
    		output = output + " fake deluxe";
    	} else if(output.contains(" deluxe")) {
    		output = output.replace(" deluxe", "");
    		output = output + " deluxe";
    	} 
    	if(output.equals("")) {
    		output = "" + number;
    	}

    	
        return output;
    	
   
   
    }

}
