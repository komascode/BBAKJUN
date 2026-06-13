import java.util.*;
class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] pol = polynomial.split(" ");
        int[] asw = new int[2];
        
        for(int i = 0 ; i < pol.length ; i ++){
            if(pol[i].equals("+")){
                if(pol[i-1].contains("x")){
                    if(pol[i-1].equals("x")){
                        asw[0]++;
                    }else{
                        asw[0] += Integer.valueOf(pol[i-1].replace("x",""));
                    }          
                }else{
                    asw[1] += Integer.valueOf(pol[i-1]);
                }
            }
            if(i==pol.length-1){
                if(pol[i].contains("x")){
                    if(pol[i].equals("x")){
                        asw[0]++;
                    }else{
                        asw[0] += Integer.valueOf(pol[i].replace("x",""));
                    }
                }else{
                    asw[1] += Integer.valueOf(pol[i]);
                }
            }
        }
        
        if(asw[0] != 0){
            if(asw[0] == 1){
                if(asw[1] != 0){
                    answer += "x + ";
                }else{
                    answer += "x";
                }
            }else{
                answer += String.valueOf(asw[0]);  
                if(asw[1] != 0){
                    answer += "x + ";
                }else{
                    answer += "x";
                }
            }
        }
        if(asw[1] != 0){
            answer += String.valueOf(asw[1]);    
        }
        
        return answer;
    }
}