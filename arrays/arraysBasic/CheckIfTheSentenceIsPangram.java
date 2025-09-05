package arrays.arraysBasic;

/**
 * Problem: Check if the Sentence Is Pangram
 * Link: https://leetcode.com/problems/check-if-the-sentence-is-pangram/
 * Time Complexity: O(n) 
 * Space Complexity: O(1) 
 */


public class CheckIfTheSentenceIsPangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
    public static boolean checkIfPangram(String sentence) {
        boolean[] arr = new boolean[26];
        for(char ch : sentence.toCharArray()){
            arr[ch-'a'] = true;
        }
        for(boolean ch : arr){
            if(!ch){
                return false;
            }
        }
        return true;
    }
}

