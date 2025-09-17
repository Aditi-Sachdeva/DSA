package strings.stringsEasy;

/**
 * Problem: Remove Outermost Parentheses
 * Link: https://leetcode.com/problems/remove-outermost-parentheses/
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        System.out.println(removeOuterParentheses(s));
    }
    public static String removeOuterParentheses(String s) {
        StringBuilder str = new StringBuilder();
        int count = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(count > 0){
                    str.append('(');
                }
                count++;
            }
            else{
                count--;
                if(count > 0){
                    str.append(')');
                }
            }
        }
        return str.toString();
    }
}
