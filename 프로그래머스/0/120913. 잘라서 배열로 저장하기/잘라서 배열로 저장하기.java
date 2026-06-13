import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        ArrayList<String> list = new ArrayList<>();
        
        char[] chr = my_str.toCharArray();
        
        for(int i = 0 ; i < my_str.length() ; i += n){
            String temp = "";
            for(int j = i ; j < i + n ; j ++){
                if(j >= chr.length){
                    break;
                }
                temp += chr[j];
            }
            list.add(temp);
        }
        
        String[] answer = list.toArray(new String[0]);
        
        return answer;
    }
}