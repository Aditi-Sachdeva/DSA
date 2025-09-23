package strings.stringsEasy;

/**
 * Problem: Merge Strings Alternately
 * Link: https://leetcode.com/problems/merge-strings-alternately/
 * Time Complexity: O(n + m) 
 * Space Complexity: O(n + m) 
 */

public class MergeStringsAlternately {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqrs";
        System.out.println(mergeAlternately(word1, word2));
    }
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder s = new StringBuilder();
        int i=0;
        int j=0;
        while(i<word1.length() && j<word2.length()){
            s.append(word1.charAt(i));
            s.append(word2.charAt(j));
            i++;
            j++;
        }

        while(i<word1.length()){
            s.append(word1.charAt(i));
            i++;
        }

        while(j<word2.length()){
            s.append(word2.charAt(j));
            j++;
        }

        return s.toString();
    }
}
