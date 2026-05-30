class Solution {
    public String solution(int age) {
        String answer = "";
        int repeat_num = 0;
        
        if(age<10) repeat_num = 1;
        else if(age<100) repeat_num = 2;
        else if(age<1000) repeat_num = 3;
        else if(age==1000) repeat_num = 4;
        
        for(int i = 0 ; i < repeat_num ; i++){
            if(age%10 == 0) answer+="a";
            if(age%10 == 1) answer+="b";
            if(age%10 == 2) answer+="c";
            if(age%10 == 3) answer+="d";
            if(age%10 == 4) answer+="e";
            if(age%10 == 5) answer+="f";
            if(age%10 == 6) answer+="g";
            if(age%10 == 7) answer+="h";
            if(age%10 == 8) answer+="i";
            if(age%10 == 9) answer+="j";
            age /= 10;
        }
        
        
        
        return new StringBuilder(answer).reverse().toString();
    }
}