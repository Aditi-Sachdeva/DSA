package strings.StringsBasic;

/**
 * - Problem: Decrypt String from Alphabet to Integer Mapping
 * - Link: https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
 * - Time Complexity: O(n)
 * - Space Complexity: O(n)
 */

public class DecryptStringFromAlphabetToIntegerMapping {
    public static void main(String[] args) {
        String s = "10#11#12";
        System.out.println(freqAlphabets(s));
    }
    public static String freqAlphabets(String s) {
        StringBuilder str = new StringBuilder();
        int i=0;
        int n = s.length();
        while(i < n){
            if(i+2 < n && s.charAt(i+2) == '#'){
                int num = Integer.parseInt(s.substring(i,i+2));
                str.append((char) ('a'+num-1));
                i+=3;
            }
            else{
                int num = s.charAt(i) - '0';
                str.append((char) ('a'+num-1));
                i++;
            }
        }
        return str.toString();
    }
}
