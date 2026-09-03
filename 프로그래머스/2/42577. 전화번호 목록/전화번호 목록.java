import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        HashSet<String> hashSet = new HashSet<>();
        
        for(String phone : phone_book){
            hashSet.add(phone);
        }
        
        for(String phone : phone_book){
            for(int i = 1 ; i < phone.length() ; i ++){
                String pre = phone.substring(0,i);
                if(hashSet.contains(pre)){
                    answer = false;
                    break;
                }
            }
            if(answer == false) break;
        }
        
        return answer;
    }
}