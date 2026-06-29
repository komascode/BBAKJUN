class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        int m = M > N ? N : M;
        int max = M > N ? M : N;
        answer += m - 1;
        answer += (max - 1) * m;
        
        return answer;
    }
}