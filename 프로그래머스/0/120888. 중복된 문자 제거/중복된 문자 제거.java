class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i = 0 ; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            String s = String.valueOf(c);
            if(answer.contains(s)){
                continue;
            }else{
                answer += my_string.charAt(i);
            }
        }
        
        return answer;
    }
}