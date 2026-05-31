import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);
        
        int max = numbers[numbers.length-1];
        int maxM1 = numbers[numbers.length-2];
        
        answer = max*maxM1;
        
        
        return answer;
    }
}