package arrays.arraysBasic;

/**
 * Problem: Average Salary Excluding the Minimum and Maximum Salary
 * Link: https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class AverageSalaryExcludingMaximumAndMinimumSalary {
    public static void main(String[] args) {
        int[] salary = {4000, 3000, 1000, 2000};
        System.out.println(average(salary));
    }

    public static double average(int[] salary) {
        int n = salary.length;
        int max = salary[0];
        int min = salary[0];
        int sum = 0;

        for (int s : salary) {
            max = Math.max(max, s);
            min = Math.min(min, s);
            sum += s;
        }

        sum -= (max + min);
        return (double) sum / (n - 2);
    }
}