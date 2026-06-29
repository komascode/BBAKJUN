class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int sum = 0;
        int bin1_dip = bin1.length();
        int bin2_dip = bin2.length();
        int square = 1;
        for(int i = bin1_dip-1 ; i >= 0 ; i --){
            
            if(bin1.charAt(i) == '1'){
                sum += square;
            }else{
                
            }
            square *= 2;
        }
        square = 1;
        for(int i = bin2_dip-1 ; i >= 0 ; i --){
            
            if(bin2.charAt(i) == '1'){
                sum += square;
            }else{
                
            }
            square *= 2;
        }
        
        while(sum>0){
            answer = (sum % 2) + answer;
            sum /= 2;
        }
        if(bin1.equals("0") && bin2.equals("0")){
            answer = "0";
        }
        return answer;
    }
}