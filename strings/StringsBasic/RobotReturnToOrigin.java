package strings.StringsBasic;

/**
 * - Problem: Robot Return to Origin
 * - Link: https://leetcode.com/problems/robot-return-to-origin/
 * - Time Complexity: O(n)
 * - Space Complexity: O(1)
 */

public class RobotReturnToOrigin {
    public static void main(String[] args) {
        String moves = "UD";
        System.out.println(judgeCircle(moves));
    }
    public static boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for(char ch : moves.toCharArray()){
            if(ch=='R'){
                x++;
            }
            else if(ch=='L'){
                x--;
            }
            else if(ch=='U'){
                y++;
            }
            else{
                y--;
            }
        }
        return x==0 && y==0;
    }
}
