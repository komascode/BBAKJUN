class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = sides[0];
        int sum = 0;
        for(int i = 0 ; i < sides.length ; i++){
            if(max < sides[i]) max = sides[i];    
        }
        for(int i = 0 ; i < sides.length ; i ++){
            sum += sides[i]; 
        }
        sum -= max;
        if(sum <= max) answer = 2;
        else answer = 1;
        
        return answer;
    }
}