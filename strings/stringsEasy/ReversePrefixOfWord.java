package strings.stringsEasy;

/**
 * Problem: Reverse Prefix of Word
 * Link: https://leetcode.com/problems/reverse-prefix-of-word/
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

public class ReversePrefixOfWord {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word, ch));
    }

    public static String reversePrefix(String word, char ch) {

        int i = word.indexOf(ch);
        if (i == -1) {
            return word;
        }
        StringBuilder str = new StringBuilder();
        str.append(word.substring(0, i + 1));
        str.reverse();
        str.append(word.substring(i + 1));
        return str.toString();

    }

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */

    // public static String reversePrefix(String word, char ch) {
    //     int i = word.indexOf(ch);
    //     if (i == -1) {
    //         return word;
    //     }
    //     char[] arr = word.toCharArray();
    //     int j = 0;
    //     while (j < i) {
    //         char temp = arr[j];
    //         arr[j] = arr[i];
    //         arr[i] = temp;
    //         i--;
    //         j++;
    //     }
    //     return String.valueOf(arr);
    // }
}
