import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] words = {"aya","ye","woo","ma"};
        
        for(String str : babbling){
            int idx = 0;
            
            while(idx < str.length()){
                if(str.startsWith("aya",idx)){
                    idx += 3;
                }else if(str.startsWith("ye",idx)){
                    idx += 2;
                }
                else if(str.startsWith("woo",idx)){
                    idx += 3;
                }
                else if(str.startsWith("ma",idx)){
                    idx += 2;
                }else{
                    break;
                }
            }
            if(idx == str.length()){
                answer++;
            }
        }
        
        return answer;
    }
}