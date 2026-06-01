class Solution {
    public int solution(int order) {
        int answer = 0;
        for(int i = 0 ; order > 0 ; i++){
            int temp = order % 10;
            if(temp == 3 || temp == 6 || temp == 9) answer++;
            order = order / 10;
        }
        
        return answer;
    }
}