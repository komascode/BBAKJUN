class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n%6==0) return n/6;
        
        for(int i = 6 ;  ; i+=6){
            if(i%n==0) return i/6;
        }
        
    }
}