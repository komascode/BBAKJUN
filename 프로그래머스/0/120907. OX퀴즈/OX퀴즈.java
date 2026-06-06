import java.util.*;
class Solution {
    public String[] solution(String[] quiz) {
        ArrayList<String> list = new ArrayList<>();
        
        for(int i = 0 ; i < quiz.length ; i ++){
            String[] str = quiz[i].split(" ");
            
                if(str[1].equals("-")){
                    if(Integer.parseInt(str[4]) == (Integer.parseInt(str[0]) - Integer.parseInt(str[2]))) list.add("O");
                    else list.add("X");
                }else if(str[1].equals("+")){
                    if(Integer.parseInt(str[4]) == (Integer.parseInt(str[0]) + Integer.parseInt(str[2]))) list.add("O");
                    else list.add("X");
                }
            
        }
        String[] answer = new String[list.size()];
        for(int i = 0 ; i < list.size() ; i ++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}