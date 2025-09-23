package strings.stringsEasy;

/**
 * Problem: Check if Binary String Has at Most One Segment of Ones
 * Link: https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/
 * Time Complexity: O(n)   
 * Space Complexity: O(1) 
 */

public class CheckIfBinaryStringHasAtmostOneSegmentOfOnes {
    public static void main(String[] args) {
        String s = "1001";
        System.out.println(checkOnesSegment(s));
    }
    public static boolean checkOnesSegment(String s) {
        boolean zero = false;
        for(char ch : s.toCharArray()){
            if(ch=='0'){
                zero = true;
            }
            else if(ch=='1' && zero){
                return false;
            }
        }
        return true;
        // return !s.contains("01");
    }
}
