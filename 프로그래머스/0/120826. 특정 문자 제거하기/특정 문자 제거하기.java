class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        char arr1 = letter.charAt(0);
        char[] arr = my_string.toCharArray();
        
        for(int i = 0 ; i < my_string.length() ; i ++){
            if(arr[i] == arr1){}else answer += arr[i];
        }
        
        
        return answer;
    }
}