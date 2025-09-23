package strings.stringsEasy;

/**
 * Problem: Roman to Integer
 * Link: https://leetcode.com/problems/roman-to-integer/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int res = 0;
        for(int i=0;i<s.length();i++){
            int curr = map.get(s.charAt(i));
            int next = (i+1 < s.length()) ? map.get(s.charAt(i+1)) : 0;
            if(curr < next){
                res -= curr;
            }
            else{
                res += curr;
            }
        }
        return res;
    }
}
