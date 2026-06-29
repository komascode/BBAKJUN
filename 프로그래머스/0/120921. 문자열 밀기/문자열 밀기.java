class Solution {
    public int solution(String A, String B) {
        String str = A;
        int answer = -1;
        if(A.equals(B)){
            return 0;
        }
        
        for(int i = 0 ; i < A.length() ; i ++){
            char last = str.charAt(str.length()-1);
            
            str = last + str.substring(0,str.length()-1);
            if(str.equals(B)){
                return 1+i;
            }
        }
        
        return answer;
    }
}