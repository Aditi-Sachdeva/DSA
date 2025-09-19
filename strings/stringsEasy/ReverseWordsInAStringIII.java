package strings.stringsEasy;

/**
 * Problem: Reverse Words in a String III  
 * Link: https://leetcode.com/problems/reverse-words-in-a-string-iii/  
 * Time Complexity: O(n)
 * Space Complexity: O(n)  
 */

public class ReverseWordsInAStringIII {
    public static void main(String[] args) {
        String s = "Mr Ding";
        System.out.println(reverseWords(s));
    } 
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder str = new StringBuilder();
        for(int i=0;i<words.length;i++){
            str.append(reverse(words[i]));
            if(i != words.length-1){
                str.append(" ");
            }  
        }
        return str.toString();
    }

    public static String reverse(String str){
        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }
}

