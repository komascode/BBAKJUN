class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for(int i = 0 ; i < nums.length ; i ++){
            for(int j = i + 1 ; j < nums.length ; j ++){
                for(int k = j + 1 ; k < nums.length ; k++){
                    int sum = nums[i] + nums[j] + nums[k];

                    if(sum < 2) continue; //0,1 패스

                    boolean flag = true;
                    for(int m = 2 ; m * m <= sum ; m++){
                        if(sum%m == 0){
                            flag = false;
                            break;
                        }
                    }

                    if(flag == true)answer++;
                }
            }
        }

        return answer;
    }
}