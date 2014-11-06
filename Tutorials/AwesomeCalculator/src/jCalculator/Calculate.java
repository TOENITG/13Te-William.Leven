/*
 * See licence file.
 */
package jCalculator;

public class Calculate {
    public String all(String input){
        
        // Makes sure there is an equal number of ( and ).
        while (countSchar(input , ')') < countSchar(input , '(')){
            input = input + ")";
        }
        
        // Solves (..)
        while (input.contains("(")) {
            int pos1 = input.lastIndexOf('(');
            int pos2 = input.indexOf(')', pos1);
        }
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
}
