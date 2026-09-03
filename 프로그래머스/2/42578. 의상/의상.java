import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        for(int i = 0 ; i < clothes.length ; i ++){
            String category = clothes[i][1];
            hashMap.put(category, hashMap.getOrDefault(category, 0) + 1);
        }
        
        for(int i : hashMap.values()){
            answer *= (i+1);
        }
        
        answer -= 1;
        
        return answer;
    }
}