package strings.StringsBasic;

/**
 * - Problem: Find the Index of the First Occurrence in a String
 * - Link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
 * - Time Complexity: O(n * m)
 * - Space Complexity: O(m)
 */

public class FindTheIndexOfTheFirstOccurrenceInTheString {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {

        int n = haystack.length();
        int m = needle.length();
        for (int i = 0; i <= n - m; i++) {
            if (haystack.substring(i, i + m).equals(needle)) {
                return i;
            }
        }
        return -1;

        /**
         * - Problem: Find the Index of the First Occurrence in a String
         * - Link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
         * - Time Complexity: O(n * m) worst-case (JVM optimized internally)
         * - Space Complexity: O(1)
         */

        // return haystack.indexOf(needle);
    }
}
