import java.util.*;

class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        
        Arrays.sort(arr);
        String answer = new String(arr);
        answer = new StringBuilder(answer).reverse().toString();
        
        return answer;
    }
}