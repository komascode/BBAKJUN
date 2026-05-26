import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {

        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        int count = 0;

        for(int i = 0 ; i < arr.length ; i++) {

            if(arr[i] % divisor == 0) {
                list.add(arr[i]);
                count++;
            }
        }

        for(int i = 0 ; i < count-1 ; i ++){
            for(int j = 0 ; j < count - 1 - i ; j++){
                if(list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        
        if(list.size() == 0){
            return new int[]{-1};
        }
        
        answer = new int[list.size()];
        
        for(int i = 0 ; i < count ; i ++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}