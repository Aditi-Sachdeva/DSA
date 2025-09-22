package strings.StringsBasic;

/**
 * - Problem: Excel Sheet Column Title
 * - Link: https://leetcode.com/problems/excel-sheet-column-title/
 * - Time Complexity: O(log n)
 * - Space Complexity: O(1)
 */

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        int columnNumber = 701;
        System.out.println(convertToTitle(columnNumber));
    }
    public static String convertToTitle(int columnNumber) {
        StringBuilder str = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            int num = columnNumber % 26;
            char el = (char) ('A'+num);
            str.append(el);
            columnNumber /= 26;
        }
        return str.reverse().toString();
    }
}
