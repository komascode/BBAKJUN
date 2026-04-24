import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = new int[1000000];
        
        int index = 0;
        for(int i = 0 ; i < arr.length-1 ; i ++){
            if(arr[i] == arr[i+1]){
                continue;
            }else{
                answer[index] = arr[i];
            }
            
            index ++;
        }
        answer[index] = arr[arr.length - 1];
        index ++;
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.

        return Arrays.copyOf(answer, index);
    }
}