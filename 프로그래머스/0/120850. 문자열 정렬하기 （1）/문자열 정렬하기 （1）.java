import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0 ; i < my_string.length() ; i++){
            for(int j = 0 ; j < 10 ; j++){
                if(my_string.charAt(i) == ('0'+j)){
                    list.add(my_string.charAt(i) - '0');
                }
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0 ; i < list.size() ; i ++){
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);

        return answer;
    }
}