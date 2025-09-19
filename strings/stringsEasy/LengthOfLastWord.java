package strings.stringsEasy;

/**
 * Problem: Length of Last Word
 * Link: https://leetcode.com/problems/length-of-last-word/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        int length = 0;

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        return length;
    }

    /**
     * Problem: Length of Last Word
     * Link: https://leetcode.com/problems/length-of-last-word/
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */

    // public static int lengthOfLastWord(String s) {
    // String[] arr = s.trim().split(" ");
    // return arr[arr.length-1].length();
    // }

}
