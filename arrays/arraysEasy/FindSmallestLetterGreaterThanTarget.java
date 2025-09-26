package arrays.arraysEasy;

/**
 * Problem: Find Smallest Letter Greater Than Target
 * Link: https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};  
        char target = 'f'; // If j, then c will be the output.
        System.out.println(nextGreatestLetter(letters, target));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int high = letters.length-1;
        char ans = letters[0];
        while(low <= high){
            int mid = low + (high-low)/2;
            if(letters[mid] > target){
                ans = letters[mid];
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}
