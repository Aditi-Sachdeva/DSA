package arrays;

import java.util.Arrays;

/**
 * Problem: Flipping an Image
 * Link: https://leetcode.com/problems/flipping-an-image/
 * Time Complexity: O(n × m)
 * Space Complexity: O(1)
 */

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] image = {
            {1, 1, 0},
            {1, 0, 1},
            {0, 0, 0}
        };

        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));

    }

    public static int[][] flipAndInvertImage(int[][] image) {
        for(int[] i : image){
            flipImage(i);
        }
        return image;
    }
    public static int[] flipImage(int[] i){
        int start = 0;
        int end = i.length-1;
        while(start<=end){
            int temp = i[start];
            i[start] = i[end]^1;
            i[end] = temp^1;
            start++;
            end--;
        }
        return i;
    }
}
