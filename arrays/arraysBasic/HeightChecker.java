package arrays.arraysBasic;


/**
 * Problem: Height Checker
 * Link: https://leetcode.com/problems/height-checker/
 * Time Complexity: O(n + k) , k = fixed size so O(n)
 * Space Complexity: O(k), k = fixed size so O(1)
 */


public class HeightChecker {
    public static void main(String[] args) {
        int[] heights = {1, 1, 4, 2, 1, 3};
        System.out.println(heightChecker(heights));
    }

    public static int heightChecker(int[] heights) {
        int[] freq = new int[101];
        for(int h : heights){
            freq[h]++;
        }
        int idx = 0;
        int count = 0;
        for(int i=1;i<101;i++){
            while(freq[i] != 0){
                if(i != heights[idx]){
                    count++;
                }
                idx++;
                freq[i]--;
            }
        }
        return count;
    }
}
