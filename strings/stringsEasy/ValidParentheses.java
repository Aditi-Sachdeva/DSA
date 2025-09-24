package strings.stringsEasy;

/**
 * Problem: Valid Parentheses
 * Link: https://leetcode.com/problems/valid-parentheses/
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s="([)]";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        if (s.length()%2!=0){ 
            return false;
        }
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '('){
                st.push(')');
            }
            else if(c == '['){
                st.push(']');
            }
            else if(c == '{'){
                st.push('}');
            }
            else if(st.isEmpty() || st.pop()!=c){
                return false;
            }
        }
        return st.isEmpty();

        // HashMap<Character,Character> map = new HashMap<>();
        // map.put(')','(');
        // map.put(']','[');
        // map.put('}','{');

        // Stack<Character> stack = new Stack<>();
        // for(char ch : s.toCharArray()){
        //     if(map.containsValue(ch)){
        //         stack.push(ch);
        //     }
        //     else if(map.containsKey(ch)){
        //         if(stack.isEmpty() || stack.pop() != map.get(ch)){
        //             return false;
        //         }
        //     }
        // }

        // return stack.isEmpty();
    }
}
