package strings.stringsEasy;

/**
 * Problem: Check If Two String Arrays are Equivalent  
 * Link: https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/  
 * Time Complexity: O(n + m)
 * Space Complexity: O(1)   
 */

public class CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {
        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
       int i = 0;
       int j = 0;
       int idx1 = 0;
       int idx2 = 0;
       while(i<word1.length && j<word2.length){
        if(word1[i].charAt(idx1) != word2[j].charAt(idx2)){
            return false;
        }
        idx1++;
        idx2++;

        if(idx1 == word1[i].length()){
            i++;
            idx1=0;
        }

        if(idx2 == word2[j].length()){
            j++;
            idx2=0;
        }
       }
       return i == word1.length && j==word2.length;
    }

    /**
     * Problem: Check If Two String Arrays are Equivalent
     * Link:
     * https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
     * Time Complexity: O(n + m)
     * Space Complexity: O(n + m)
     */

    // public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    //     StringBuilder s1 = new StringBuilder();
    //     StringBuilder s2 = new StringBuilder();
    //     for (String str : word1) {
    //         s1.append(str);
    //     }
    //     for (String str : word2) {
    //         s2.append(str);
    //     }
    //     return s1.toString().equals(s2.toString());
    // }
}
