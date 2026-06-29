class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(; i <= j ; i++){
            String str = "";
            str = String.valueOf(i);
            
            for(int n = 0 ; n < str.length() ; n ++){
                if(str.charAt(n) == String.valueOf(k).charAt(0)){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}