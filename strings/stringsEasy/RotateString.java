package strings.stringsEasy;

/**
 * Problem: Rotate String
 * Link: https://leetcode.com/problems/rotate-string/
 * Time Complexity: O(n²)
 * Space Complexity: O(n)
 */

public class RotateString {
    public static void main(String[] args) {
        String s = "abcde";
        String t = "cdeab";
        System.out.println(rotateString(s, t));
    }
    public static boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        return (s+s).contains(goal);
    }
}
