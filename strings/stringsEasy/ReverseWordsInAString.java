package strings.stringsEasy;

/**
 * Problem: Reverse Words in a String
 * Link: https://leetcode.com/problems/reverse-words-in-a-string/
 * Time Complexity: O(n) 
 * Space Complexity: O(n) 
 */

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder str = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            str.append(words[i]);
            if (i != 0) {
                str.append(" ");
            }
        }
        return str.toString();

    }

    // public String reverseWords(String s) {
    //     String[] words = s.trim().split("\\s+");
    //     int left = 0;
    //     int right = words.length - 1;
    //     while (left <= right) {
    //         String temp = words[left];
    //         words[left] = words[right];
    //         words[right] = temp;
    //         left++;
    //         right--;
    //     }
    //     return String.join(" ", words);
    // }
}
