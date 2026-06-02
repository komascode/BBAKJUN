import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        int[] count = new int[26];
        char[] charr = s.toCharArray();
        char[] alpha = {
            'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
            'o','p','q','r','s','t','u','v','w','x','y','z'
        };
        
        for(int i = 0 ; i < alpha.length; i ++){
            for(int j = 0 ; j < charr.length; j ++){
                if(alpha[i] == charr[j]){
                    count[i]++;
                }
            }
        }
        
        for(int i = 0 ; i < alpha.length ; i++){
            if(count[i] == 1){
                answer += alpha[i];
            }
        }
        
        
        
        return answer;
    }
}