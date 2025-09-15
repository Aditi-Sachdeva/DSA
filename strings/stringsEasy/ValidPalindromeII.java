package strings.stringsEasy;

/**
 * Problem: Valid Palindrome II
 * Link: https://leetcode.com/problems/valid-palindrome-ii/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class ValidPalindromeII {
    public static void main(String[] args) {
        String s = "abca";
        System.out.println(validPalindrome(s));
    }
    public static boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return isPalindrome(s,left+1,right) || isPalindrome(s,left,right-1);
            }
            left++;
            right--;
        }
        return true;
    }
    public static boolean isPalindrome(String s, int left, int right){
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
