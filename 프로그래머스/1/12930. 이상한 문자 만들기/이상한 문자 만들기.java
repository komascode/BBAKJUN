class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        String[] str = s.split(" ", -1);
        
        for(int i = 0 ; i < str.length ; i ++){
            for(int j = 0 ; j < str[i].length() ; j ++){
                if((j+1)%2==1){
                    if(str[i].charAt(j)>'Z'){
                        sb.append((char)(str[i].charAt(j)-32));
                    }else{
                        sb.append(str[i].charAt(j));
                    }
                }else{
                    if(str[i].charAt(j)<='Z'){
                        sb.append((char)(str[i].charAt(j)+32));
                    }else{
                        sb.append(str[i].charAt(j));
                    }
                }
            }
            if(i == (str.length -1)){
                
            }else{
                sb.append(" ");
            }
        }
        
        String answer = sb.toString();
        
        return answer;
    }
}