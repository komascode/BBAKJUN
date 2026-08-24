class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = num;
        
        for(int i = 0 ; ; i ++){
            if(n == 1) return 0;
            n = collatz(n);
            if(n == 1){
                answer = i+1;
                break;
            }
            if(i==499){
                return -1;
            }
        }
        
        return answer;
    }
    public long collatz(long num){
        if(num%2==0){
            num /= 2;
        }else{
            num = num*3 +1;
        }
        return num;
    }
}