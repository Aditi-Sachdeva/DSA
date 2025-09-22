package strings.StringsBasic;

/**
 * - Problem: Sorting the Sentence
 * - Link: https://leetcode.com/problems/sorting-the-sentence/
 * - Time Complexity: O(n)
 * - Space Complexity: O(n)
 */

public class SortingTheSentence {
    public static void main(String[] args) {
        String s = "Myself2 Me1 I4 and3";
        System.out.println(sortSentence(s));

    }
    public static String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] sorted = new String[words.length];
        for(String word : words){
            int idx = word.charAt(word.length()-1) - '1';
            sorted[idx] = word.substring(0,word.length()-1);
        }
        return String.join(" ",sorted);
    }
}
