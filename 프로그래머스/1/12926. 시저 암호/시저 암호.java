import java.util.*;
class Solution {
    public String solution(String s, int n) {
        String answer = "";
        List<Character> list = new ArrayList<>();
        
        for(int i = 0 ; i < s.length() ; i ++){
            list.add(s.charAt(i));
        }
        
        for(int i = 0 ; i < s.length() ; i ++){
            if(s.charAt(i) != ' '){
                char c = s.charAt(i);
                if(c >= 'a' && c <= 'z'){
                    list.set(i, (char)((c - 'a' + n) % 26 + 'a'));
                }else{
                    list.set(i, (char)((c - 'A' + n) % 26 + 'A'));
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (char c : list) {
            sb.append(c);
        }
        answer = sb.toString();
        
        return answer;
    }
}