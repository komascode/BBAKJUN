import java.util.*;
class Solution {
    public int solution(int[] array) {
        int[] freq = new int[1000];
        int answer = 0;
        
        Arrays.sort(array);
        
        for(int i = 0 ; i < array.length ; i ++){
            int num = array[i];
            freq[num]++;
        }
        
        int max = 0;
        
        for(int i = 0 ; i < freq.length ; i++){
            if(max < freq[i]) {max = freq[i]; answer = i;}
        }
        
        int count = 0;
        
        for(int i = 0 ; i < freq.length ; i ++){
            if(max == freq[i]) count++;
        }
        
        if(count >= 2) return -1;
        
        return answer;
    }
}