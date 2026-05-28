class Solution {
    public int[] solution(int number1, int denom1, int number2, int denom2) {
        int[] answer = {};
        
        int number = number1 * denom2 + number2 * denom1;
        int denom = denom1 * denom2;
        
        int max = 1;
        
        for(int i = 1 ; i <= number && i <= denom ; i++){
            if(denom%i==0 && number%i==0){
                max = i;
            }
        }
        
        denom = denom/max;
        number = number/max;
        
        answer = new int[]{number,denom};
        
        return answer;
    }
}