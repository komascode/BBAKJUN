class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        answer = hazard(x);
        
        return answer;
    }
    public boolean hazard(int x){
        int sum = 0;
        int number = x;
        int[] num = new int[]{0,0,0,0,0};
        
        for(int i = 0 ; i < 5 ; i ++){
            if(x / 10 > 0){
                num[i] = x % 10;
                x /= 10;
            }else{
                num[i] = x % 10;
                break;
            }
        }
        for(int i = 0 ; i < 5 ; i ++){
            sum += num[i];
        }
        if(number % sum == 0){
            return true;
        }else{
            return false;
        }
    }
}