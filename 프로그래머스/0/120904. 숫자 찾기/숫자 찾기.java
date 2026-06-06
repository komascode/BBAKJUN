class Solution {
    public int solution(int num, int k) {
        String str = String.valueOf(num);
        char[] ch = str.toCharArray();
        
        int answer = 0;
    
        for(int i = 0 ; i < str.length() ;i ++){
            if(ch[i] == (char)(k+'0')) {
                answer = i+1;
                break;
            }
        }
        if(answer == 0) return -1;
        return answer;
    }
}