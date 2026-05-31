class Solution {
    public int solution(int n) {
        int answer = 0;
        int fac = 1;
        int i = 1;
        
        while(fac<=n){
            i++;
            fac *= i;
        }
        answer = i-1;
        
        return answer;
    }
}