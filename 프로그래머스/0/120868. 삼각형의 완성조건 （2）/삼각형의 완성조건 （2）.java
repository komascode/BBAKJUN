class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = sides[0];
        int min = sides[1];
        
        if(max < sides[1]){
            max = sides[1];
            min = sides[0];
        }
        
        for(int i = 0 ; i <= max ; i ++){
            if(i+min > max) answer++;
            
        }
        
        for(int i = max+1 ; max + min > i ; i ++){
            answer++;
        }
        
        return answer;
    }
}