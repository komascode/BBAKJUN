class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1 ; i <= n ; i++){
            if(i!=2&&i%2==0)answer++;
            else if(i!=3&&i%3==0)answer++;
            else if(i!=5&&i%5==0)answer++;
            else if(i!=7&&i%7==0)answer++;
        }
        
        return answer;
    }
}