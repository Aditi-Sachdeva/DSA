package strings.StringsBasic;

/**
 * - Problem: To Lower Case
 * - Link: https://leetcode.com/problems/to-lower-case/
 * - Time Complexity: O(n)
 * - Space Complexity: O(n)
 */

public class ToLowerCase {
    public static void main(String[] args) {
       String s = "Hello";
       System.out.println(toLowerCase(s));
    }
    public static String toLowerCase(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {     // No for-each loop because then we will be looping over the copy of each character.
            if (arr[i] >= 'A' && arr[i] <= 'Z') {  // That will not modify the original array.
                arr[i] = (char)(arr[i] + 32);
            }
        }

        return new String(arr); 
    }
}
