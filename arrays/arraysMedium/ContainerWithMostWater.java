package arrays.arraysMedium;

/**
 * Problem: Container With Most Water
 * Link: https://leetcode.com/problems/container-with-most-water/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length -1;
        int max=0;
        while(i<j){
            int area = Math.min(height[i],height[j]) * (j-i);
            max = Math.max(area,max);
            if(height[i] < height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return max;
    }
}
