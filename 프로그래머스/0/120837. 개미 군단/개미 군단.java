class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        int jang = hp/5;
        hp %= 5;
        int byeong = hp/3;
        hp %= 3;
        int ill = hp;
        
        answer = jang+byeong+ill;
        
        return answer;
    }
}