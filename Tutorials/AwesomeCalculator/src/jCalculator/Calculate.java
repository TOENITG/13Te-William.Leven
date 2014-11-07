/*
 * See licence file.
 */
package jCalculator;

public class Calculate {
    
    // solves an equation as string
    public String all(String input){
        
        // Solving (..).
        input = pars(input);
        
        // Solves "*".
        input = operate(input, '*');
        
        // Solves "/".
        input = operate(input, '/');
        
        // Solves "+".
        input = operate(input, '+');
        
        // Solves "-".
        input = operate(input, '-');
        
        return input;
    }
    
    // Counts how many arg2's there is in arg1.
    public int countSchar(String text, char Schar) {
        // Starts at 0 and adds one for every char it finds.
        int temp = 0;
        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) == Schar){
                temp++;
            }
    }
    return temp;
    }
    
    // Finds highest number in arg1.
    public int highest(int[] input){
        // Loops trough input for highest number.
        int result = input[0];
        for (int i = 1; i < input.length; i++){
            if (result < input[i]){
                result = input[i];
            }
        }
        return result;
    }
    
    // Grabs lowest value of arg1, if arg2 is true it will only look for values  above 0.
    public int lowest(int[] input, boolean ltza){
        // If < 0 isn't allowed.
        // Sets default to highest number and loop for lower numbers above 0.
        int result = highest(input);
        if (!ltza){
            for (int i = 1; i < input.length; i++){
                if (input[i] > 0 && result > input[i]){
                    result = input[i];
                }
            } 
        }
        // Else it just loops for lowest number.
        else {
            result = input[0];
            for (int i = 1; i < input.length; i++){
                if (result > input[i]){
                    result = input[i];
                }
            }
        }
            
        return result;
    }
    
    // Solves expressions inside of (..)'s.
    public String pars(String input){
        // Makes sure there is an equal number of ( and ).
        while (countSchar(input , ')') < countSchar(input , '(')){
            input = input + ")";
        }
        
        // Solves all (..).
        while (input.contains("(")) {
            
            // Grabbing pair
            int pos1 = input.lastIndexOf('(');
            int pos2 = input.indexOf(')', pos1);
            
            // Sending expression inside of a pair to all for solving.
            String answer = all(input.substring(pos1 + 1, pos2));
            
            // Implenting answer in the original equation.
            input = input.substring(0, pos1) + answer + input.substring(pos2 +1, input.length());
        }
        return input;
    }
    
    // Solve all arg2 operations in arg1.
    public String operate(String input, char operator){
        
        // makes sure every operator is solved
        while (input.contains(String.valueOf(operator))) {
            
            // Grabbing possition of operator
            int x = input.indexOf(operator);
            
            // Grabbing possible values for end.
            int[] p_end = {input.indexOf('*', x +1) - 1,
                           input.indexOf('/', x +1) - 1,
                           input.indexOf('-', x +1) - 1,
                           input.indexOf('+', x +1) - 1,
                           input.length() - 1};
            // Grabbing lowest value which is higher or equal to 0.
            int end = lowest(p_end, false);
            
            // Grabbing possible values for start.
            int[] p_start = {input.substring(0, x ).lastIndexOf('*') + 1,
                             input.substring(0, x ).lastIndexOf('/') + 1, 
                             input.substring(0, x ).lastIndexOf('+') + 1, 
                             input.substring(0, x ).lastIndexOf('-') + 1, 
                             0};
            // Grabbing highest value.
            int start = highest(p_start);
            
            // Chosing and performs operation.
            double answer = 0;
            switch (operator) {
                case '/': answer = Double.parseDouble(input.substring(start, x )) /
                    Double.parseDouble(input.substring(x + 1, end + 1));
                    break;
                case '*': answer = Double.parseDouble(input.substring(start, x )) *
                    Double.parseDouble(input.substring(x + 1, end + 1));
                    break;
                case '+': answer = Double.parseDouble(input.substring(start, x )) +
                    Double.parseDouble(input.substring(x + 1, end + 1));
                    break;
                case '-': answer = Double.parseDouble(input.substring(start, x )) -
                    Double.parseDouble(input.substring(x + 1, end + 1));
                    break;
            }
            
            // Place answer inside the input
            input = input.substring(0, start ) + Double.toString(answer) + input.substring(end + 1 , input.length());
            
        }
        return input;
    }
}