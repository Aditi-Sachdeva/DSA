package strings.stringsMedium;

/**
 * Problem: Longest Palindromic Substring
 * Link: https://leetcode.com/problems/longest-palindromic-substring/
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
    public static String longestPalindrome(String s) {
        if(s.length() <= 1){
            return s;
        }
        String lps = "";
        for(int i=1;i<s.length();i++){
            int low = i;
            int high = i;
            while(s.charAt(low) == s.charAt(high)){
                low--;
                high++;
                if(low == -1 || high == s.length()){
                    break;
                }
            }

            String palindrome = s.substring(low+1,high);
            if(palindrome.length() > lps.length()){
                lps = palindrome;
            }

            low = i-1;
            high = i;
            while(s.charAt(low) == s.charAt(high)){
                low--;
                high++;
                if(low == -1 || high == s.length()){
                    break;
                }
            }

            palindrome = s.substring(low+1,high);
            if(palindrome.length() > lps.length()){
                lps = palindrome;
            }
        }
        return lps;
    }

}
