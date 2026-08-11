import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int idx = 0;
        for(int i = 0 ; i < arr.length ; i ++){
            if(arr[i]<arr[idx]){
                idx = i;
            }
        }
        for(int i = 0 ; i < arr.length ; i ++){
            if(i == idx) continue;
            list.add(arr[i]);
        }
        int[] answer = new int[list.size()];
        for(int i = 0 ; i < list.size() ; i ++){
            answer[i] = list.get(i);
        }
        if(list.size() == 0){
            answer = new int[]{-1};
        }
        
        return answer;
    }
}