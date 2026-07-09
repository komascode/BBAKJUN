class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int count_p = 0;
        int count_y = 0;
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        for(int i = 0 ; i < s.length() ; i ++){
            if(s.charAt(i)=='p'||s.charAt(i)=='P') count_p++;
            if(s.charAt(i)=='y'||s.charAt(i)=='Y') count_y++;
        }
        if(count_p==count_y) answer=true;
        return answer;
    }
}