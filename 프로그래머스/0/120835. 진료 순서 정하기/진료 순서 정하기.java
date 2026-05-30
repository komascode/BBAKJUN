class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        for(int i = 0 ; i < emergency.length ; i ++){
            int rank = answer.length;
            int aw = emergency[i];

            for(int j = 0 ; j < emergency.length ; j ++){
                if(aw > emergency[j]) rank--;
            }
            answer[i] = rank;
        }
        
        return answer;
    }
}