package strings.StringsBasic;

/**
 * - Problem: Determine if String Halves Are Alike
 * - Link: https://leetcode.com/problems/determine-if-string-halves-are-alike/
 * - Time Complexity: O(n)
 * - Space Complexity: O(1)
 */

public class DetermineIfStringHalvesAreAlike {
    public static void main(String[] args) {
        String s = "textbook";
        System.out.println(halvesAreAlike(s));
    }
    public static boolean halvesAreAlike(String s) {
        int half = s.length() / 2;
        int c1 = 0;
        int c2 = 0;
        int idx = 0;
        while (idx < half) {
            char ch1 = s.charAt(idx);
            char ch2 = s.charAt(idx + half);
            if (isVowel(ch1)) {
                c1++;
            }
            if (isVowel(ch2)) {
                c2++;
            }
            idx++;
        }
        return c1 == c2;
    }

    public static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            return true;
        }
        return false;
    }
}
