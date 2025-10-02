package arrays.arraysMedium;

/**
- Problem: Merge Intervals
- Link: https://leetcode.com/problems/merge-intervals/
- Time Complexity: O(n log n)
- Space Complexity: O(n) 
*/

import java.util.Arrays;
import java.util.ArrayList;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(merge(intervals)));
    }
    public static int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        ArrayList<int[]> list = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(list.isEmpty() || intervals[i][0] > list.get(list.size()-1)[1]){
                list.add(intervals[i]);
            }
            else{
                list.get(list.size()-1)[1] = Math.max(list.get(list.size() - 1)[1], intervals[i][1]);
            }
        }
        return list.toArray(new int[list.size()][]);

    }
}
