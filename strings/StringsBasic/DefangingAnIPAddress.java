package strings.StringsBasic;

/**
 * - Problem: Defanging an IP Address
 * - Link: https://leetcode.com/problems/defanging-an-ip-address/
 * - Time Complexity: O(n)
 * - Space Complexity: O(n)
 */

public class DefangingAnIPAddress {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }
    public static String defangIPaddr(String address) {
        StringBuilder str = new StringBuilder();
        for(char ch : address.toCharArray()){
            if(ch == '.'){
                str.append("[.]");
            }
            else{
                str.append(ch);
            }
        }
        return str.toString();
    }
}
