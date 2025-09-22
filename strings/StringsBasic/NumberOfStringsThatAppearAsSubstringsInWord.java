package strings.StringsBasic;

/**
 * - Problem: Number of Strings That Appear as Substrings in Word
 * - Link: https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/
 * - Time Complexity: O(n * m)
 * - Space Complexity: O(1)
 */

public class NumberOfStringsThatAppearAsSubstringsInWord {
    public static void main(String[] args) {
        String[] patterns = {"a","abc","bc","d"} ;
        String word = "abc";
        System.out.println(numOfStrings(patterns, word));
    }
    public static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(String s : patterns){
            if(word.contains(s)){
                count++;
            }
        }
        return count;
    }
}
