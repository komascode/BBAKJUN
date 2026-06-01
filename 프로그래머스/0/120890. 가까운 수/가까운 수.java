class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int temp = 0;
        int min = n - array[0];
        if(min < 0) min *= -1;
        
        int idx = 0;
        for(int i = 0 ; i < array.length ; i++){
            temp = n - array[i];
            if(temp < 0) temp *= -1;
            if(temp < min){
                min = temp;
                idx = i;
            }
            else if(temp == min && array[i] < array[idx]){
                idx = i;
            }
        }
        
        return array[idx];
    }
}