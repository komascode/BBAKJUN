class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        
        int num = num2-num1;
        int idx = 0;
        int[] answer = new int[num+1];

        for(int i = num1 ; i <= num2 ; i ++){
            answer[idx] = numbers[i];
            idx++;
        }
        
        return answer;
    }
}