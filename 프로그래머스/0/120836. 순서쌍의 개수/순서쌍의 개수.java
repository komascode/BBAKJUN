class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int a = 1;
        int b = n;
        
        for(int i = 0 ; i < n ; i ++){
            if((n % b)==0 ) {
                a = n / b;
                answer++;
            }
            b--;
        }
        
        
        return answer;
    }
}