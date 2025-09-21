package strings.StringsBasic;

/**
 * - Problem: Goal Parser Interpretation
 * - Link: https://leetcode.com/problems/goal-parser-interpretation/
 * - Time Complexity: O(n)
 * - Space Complexity: O(n)
 */

public class GoalParserInterpretation {
    public static void main(String[] args) {
        String command = "G()()()()(al)";
        System.out.println(interpret(command));
    }
    public static String interpret(String command) {
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while (i < command.length()) {
            if(command.charAt(i)=='G'){
                ans.append("G");
                i++;
            }
            else if(command.charAt(i) == '('){
                if(command.charAt(i+1) == ')'){
                    ans.append("o");
                    i += 2;
                }
                else{
                    ans.append("al");
                    i += 4;
                }
            }
        }
        return ans.toString();
    }
}
