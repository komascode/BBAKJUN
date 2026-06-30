class Solution {
    public int solution(int[] common) {
        int answer = 0;
        boolean gap = false;
        int gongcha = common[1] - common[0];
        
        if(gongcha == common[2] - common[1]){
            return common[common.length-1]+gongcha;
        }else{
            int gongbe = common[1] / common[0];
            return common[common.length-1]*gongbe;
        }
        
    }
}