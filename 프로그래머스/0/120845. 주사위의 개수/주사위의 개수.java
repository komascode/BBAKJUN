class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        
        int width = box[0]/n*n;
        int depth = box[1]/n*n;
        int height = box[2]/n*n;
        
        answer = (width*depth*height)/(n*n*n);
        
        return answer;
    }
}