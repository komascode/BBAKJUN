import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        String[] arr = s.split(" ");
        
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i].equals("Z")){
                list.add(i-1);
                continue;
            }
            answer += Integer.parseInt(arr[i]);
        }
        for(int i = 0 ; i < list.size() ; i++){
            answer -= Integer.parseInt(arr[list.get(i)]);
        }
               
        return answer;
    }
}