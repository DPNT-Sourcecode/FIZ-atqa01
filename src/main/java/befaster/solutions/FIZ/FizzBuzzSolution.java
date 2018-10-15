package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
       String output = "";
    	if(number > 9999 || number < 1){
    		throw new IllegalArgumentException("Input parameters out of bounds");
    	}
    	if(number%3 == 0 || ("" + number).indexOf('3')!= -1) {
    		
    		output = output + "fizz";
    	}
    	if(number%5 == 0 || ("" + number).indexOf('5')!= -1) {
    		if(output.equals("")) {
    			output = "buzz";
    		} else {
    		output = output + " buzz";
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
    			
    			output = "deluxe";
    		} else {
    			
    			output = output + " deluxe"; 
    		}
    		
    		
    	}
    	
    	if(output.equals("") && (!(number%3 == 0 || ("" + number).indexOf('3')!= -1) && !(number%5 == 0 || ("" + number).indexOf('5')!= -1))) {
    		output = "" + number;
    	}

    	
        return output;
    	
   
   
    }

}
