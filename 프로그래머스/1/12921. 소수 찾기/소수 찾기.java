class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 2 ; i <= n ; i ++){
            if(isPrime(i)){
                answer++;
            }
        }
        return answer;
    }
    
    private boolean isPrime(int x){
        for(int j = 2; j * j <= x ; j++){
            if (x%j==0){
                return false;
            }
            
        }
        return true;
    }
}