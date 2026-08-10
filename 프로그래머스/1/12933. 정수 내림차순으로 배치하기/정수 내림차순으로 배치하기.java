import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String str = String.valueOf(n);
        
        char[] arr = str.toCharArray();
        
        Arrays.sort(arr);
        
        String sorted = new String(arr);
        
        String reversed = new StringBuilder(sorted).reverse().toString();
        
        answer = Long.parseLong(reversed);
                
        return answer;
    }
}