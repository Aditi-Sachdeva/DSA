package strings.stringsEasy;

/**
 * Problem: Isomorphic Strings
 * Link: https://leetcode.com/problems/isomorphic-strings/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));
    }
    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] sfreq = new int[256];
        int[] tfreq = new int[256];

        for(int i=0;i<s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(sfreq[c1] == 0 && tfreq[c2]==0){
                sfreq[c1] = c2;
                tfreq[c2] = c1;
            }
            else if(sfreq[c1] != c2 || tfreq[c2] != c1){
                return false;
            }
        }
        return true;
    }
}
