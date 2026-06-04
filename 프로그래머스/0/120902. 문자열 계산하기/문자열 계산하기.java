class Solution {
    public int solution(String my_string) {        
        String[] str = my_string.split(" ");
        int one;
        one = Integer.parseInt(str[0]);
        int answer = one;
        for(int i = 0 ; i < str.length - 2 ; i+=2){
            if(str[i+1].equals("+")) answer += Integer.parseInt(str[i+2]);
            if(str[i+1].equals("-")) answer -= Integer.parseInt(str[i+2]);
        }
        return answer;
    }
}