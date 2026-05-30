class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        
        int repeat = k*2;
        int j = 0;
        
        for(int i = 0 ; i < k ; i++){
            if(j >= numbers.length){
                j = j%numbers.length;
                answer = numbers[j];
            }
            answer = numbers[j];
            j+=2;
        }
        
        return answer;
    }
}