package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
      
    	if(number > 9999 || number < 1){
    		throw new IllegalArgumentException("Input parameters out of bounds");
    	}
    	if(number%3 == 0 && number%5 != 0) {
    		return "fizz";
    	}
   
    	if(number%3 != 0 && number%5 == 0) {
    		return "buzz";
    	}
    	if(number%3 == 0 && number%5 == 0) {
    		return "fizz buzz";
    	}
    	
        return "" + number;
    	
   
   
    }

}
