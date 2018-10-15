package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
       String output = "";
    	if(number > 9999 || number < 1){
    		throw new IllegalArgumentException("Input parameters out of bounds");
    	}
    	if(number%3 == 0 && ("" + number).indexOf('3')!= -1) {
    		
    		output = output + "fizz deluxe";
    	}
    	if(number%5 == 0 && ("" + number).indexOf('5')!= -1) {
    		if(output.equals("")) {
    			output = "buzz deluxe";
    		} else {
    		output = output + " buzz deluxe";
    		}
    	}
    	
    	String num = "0123456789";
    	int count = 0;
    	for (int i = 0 ; i < num.length(); i++){
    		if ( (""+number).indexOf(num.charAt(i)) !=-1){
    			count++;
    		}
    	}
    	
    	if (count == 1 && number > 10) {
    		
    		if(output.equals("")) {
    			if(number % 2 == 0) {
    				
    			output = "deluxe";
    			}else{
    				output = "fake deluxe";
    			}
    		} else {
    			if(number % 2 == 0) {
    				
    			output = output + " deluxe"; 
    			} else {
    				output = output + " fake deluxe";
    			}
    			
    		}
    		
    		
    	}
    	
    	if(output.equals("") && (!(number%3 == 0 || ("" + number).indexOf('3')!= -1) && !(number%5 == 0 || ("" + number).indexOf('5')!= -1))) {
    		output = "" + number;
    	}

    	
        return output;
    	
   
   
    }

}
