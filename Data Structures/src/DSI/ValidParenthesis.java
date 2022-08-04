package DSI;

import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
    private static final Map<Character, Character> mapping = Map.of('(', ')',
                                                                    '{', '}',
                                                                    '[', ']');

    public static boolean isValid(String s ){
         Stack<Character> stack = new Stack<>();

         for (char c: s.toCharArray()) {
             if (mapping.containsKey(c)){ //check if the character is valid
                 stack.push(c); ////if its an open parenthesis add it to the stack
             } else {
                 if (stack.isEmpty()){ //if c is a closed parenthesis and is not matched with an open parenthesis
                    return false;
                 }
                 char open = stack.pop();
                 if (mapping.get(open) != c){
                     return false;
                 }
             }
         }
         return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));

        String s1 = "(]";
        System.out.println(isValid(s1));

        String s2 = "()";
        System.out.println(isValid(s2));

        String s3 = "{{{((})))";
        System.out.println(isValid(s3));

        String s4 = "{{{((%%%%";
        System.out.println(isValid(s4));


    }
}
