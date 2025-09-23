package strings.stringsEasy;

/**
 * Problem: Maximum Repeating Substring
 * Link: https://leetcode.com/problems/maximum-repeating-substring/
 * Time Complexity: O(n × k) 
 * Space Complexity: O(1)
 */

public class MaximumRepeatingSubstring {
    public static void main(String[] args) {
        String sequence = "ababc";
        String word = "ab";
        System.out.println(maxRepeating(sequence, word));
    }
    public static int maxRepeating(String sequence, String word) {
        int max = 0;
        int len = word.length();
        for(int i=0;i<=sequence.length()-len;i++){
            int count = 0;
            while(sequence.startsWith(word,i+count*len)){
                count++;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}

