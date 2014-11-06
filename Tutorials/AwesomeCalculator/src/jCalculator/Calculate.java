/*
 * See licence file.
 */
package jCalculator;

public class Calculate {
    public String all(String input){
        
        // Solving (..).
        input = pars(input);
        
        // Solves "*".
        input = multiplication(input);
        
        // Solves "/".
//        input = division(input);
        
        // Solves "+".
//        input = addition(input);
        
        // Solves "-".
//        input = subtraction(input);
        
        return input;
    }
    
    public int countSchar(String text, char Schar) {
    int temp = 0;
    for (int i = 0; i < text.length(); i++){
        if (text.charAt(i) == Schar){
            temp++;
        }
    }
    return temp;
    }
    
    public int highest(int[] input){
        int result = input[0];
        for (int i = 1; i < input.length; i++){
            if (result < input[i]){
                result = input[i];
            }
        }
        return result;
    }
    
    public int lowest(int[] input, boolean ltza){
        int result = 0;
        if (!ltza){
            for (int i = 1; i < input.length; i++){
                if (input[i] > 0 && result > input[i]){
                    result = input[i];
                }
            } 
        }
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
    
    public String pars(String input){
        // Makes sure there is an equal number of ( and ).
        while (countSchar(input , ')') < countSchar(input , '(')){
            input = input + ")";
        }
        
        // Solves (..).
        while (input.contains("(")) {
            
            // Grabbing pair
            int pos1 = input.lastIndexOf('(');
            int pos2 = input.indexOf(')', pos1);
            
            // Sending expression inside of a pair to all for solving.
//            input = input.replace(input.substring(pos1, pos2), all(input.substring(pos1 + 1, pos2 - 1)));
        }
        return input;
    }
    
    public String multiplication(String input){
        
        while (input.contains("*")) {
            
            // Grabbing 
            int x = input.indexOf('*');
            
            
            // Grabbing possible values for end.
            int[] p_end = {input.indexOf('*', x +1) - 1,
                           input.indexOf('/', x +1) - 1,
                           input.indexOf('-', x +1) - 1,
                           input.indexOf('+', x +1) - 1,
                           input.length() - 1};
            
            System.out.println(p_end[0]);
            System.out.println(p_end[1]);
            System.out.println(p_end[2]);
            System.out.println(p_end[3]);
            System.out.println(p_end[4]);
            
            // Grabbing lowest value 
            int end = lowest(p_end, false);
            
            System.out.println(end);
            
            // Grabbing possible values for start.
            int[] p_start = {input.substring(0, x ).lastIndexOf('*') + 1,
                             input.substring(0, x ).lastIndexOf('/') + 1, 
                             input.substring(0, x ).lastIndexOf('+') + 1, 
                             input.substring(0, x ).lastIndexOf('-') + 1, 
                             0};
            // Grabbing highest value /+
            int start = highest(p_start);
            
            System.out.println(p_start[0]);
            System.out.println(p_start[1]);
            System.out.println(p_start[2]);
            System.out.println(p_start[3]);
            System.out.println(p_start[4]);
            System.out.println(start);
            
            // Calculate
            double answer = Double.parseDouble(input.substring(start, x )) *
                            Double.parseDouble(input.substring(x + 1, end + 1));
            
            System.out.println(input.substring(start, x ));
            System.out.println(input.substring(x + 1, end+1));
            System.out.println(answer);
            
            // Place answer inside the input
            input = input.substring(0, start ) + Double.toString(answer) + input.substring(end + 1 , input.length());
            
            System.out.println(input);
        }
        return input;
    }

    
}
