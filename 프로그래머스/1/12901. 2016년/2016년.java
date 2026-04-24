class Solution {
    public String solution(int a, int b) {
        String answer = "";
    
        int days = 0;
        
        for(int i = 0 ; i < a-1; i ++){
            if(i==0) days += 31;
            if(i==1) days += 29;
            if(i==2) days += 31;
            if(i==3) days += 30;
            if(i==4) days += 31;
            if(i==5) days += 30;
            if(i==6) days += 31;
            if(i==7) days += 31;
            if(i==8) days += 30;
            if(i==9) days += 31;
            if(i==10) days += 30;
            if(i==11) days += 31;
 
        }
            
        days += b;

        if(days%7 == 1) answer = "FRI";
        if(days%7 == 2) answer = "SAT";
        if(days%7 == 3) answer = "SUN";
        if(days%7 == 4) answer = "MON";
        if(days%7 == 5) answer = "TUE";
        if(days%7 == 6) answer = "WED";
        if(days%7 == 0) answer = "THU";
    
        return answer;
    }
}