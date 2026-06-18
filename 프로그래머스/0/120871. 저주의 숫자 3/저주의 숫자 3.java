class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        
        for(int i = 1 ; ; i ++){
            if(i%3==0){
                continue;
            }
            if(String.valueOf(i).contains("3")){
                continue;
            }
            count++;
            if(count == n){
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}