class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        int spell_length = spell.length;
        
        for(int i = 0 ; i < dic.length; i ++){
            if(spell_length == dic[i].length()){
                int count = 0;
                for(int j = 0; j < spell_length ; j ++){
                    if(dic[i].contains(spell[j])){
                        count++;
                    }
                }
                if(count == spell_length){
                    answer = 1;
                    break;
                }
            }
        }
        
        
        return answer;
    }
}