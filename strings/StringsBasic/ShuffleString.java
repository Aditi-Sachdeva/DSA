package strings.StringsBasic;

/**
 * - Problem: Shuffle String
 * - Link: https://leetcode.com/problems/shuffle-string/
 * - Time Complexity: O(n)
 * - Space Complexity: O(n)
 */


public class ShuffleString {
    public static void main(String[] args) {
        String s = "abc";
        int[] indices = {1,2,0};
        System.out.println(restoreString(s, indices));
    }
    public static String restoreString(String s, int[] indices) {
        char[] res = new char[s.length()];
        for(int i=0;i<s.length();i++){
            res[indices[i]] = s.charAt(i);
        }
        return new String(res);
    }
}
