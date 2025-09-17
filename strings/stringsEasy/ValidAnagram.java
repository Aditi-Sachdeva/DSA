package strings.stringsEasy;

/**
 * Problem: Valid Anagram
 * Link: https://leetcode.com/problems/valid-anagram/
 * Time Complexity: O(n)
 * Space Complexity: O(1) 
 */


public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] freq = new int[26];

        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        for(char ch: t.toCharArray()){
            freq[ch-'a']--;
        }
        
        for(int c : freq){
            if(c != 0){
                return false;
            }
        }
        return true;
    }
}
