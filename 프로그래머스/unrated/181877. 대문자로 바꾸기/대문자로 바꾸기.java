class Solution {
    public String solution(String myString) {
        String answer = "";
        char tmp;
        
        for(int i = 0; i <myString.length(); i++){
            tmp = myString.charAt(i);
            if((97 <= tmp) && (tmp <= 122)){
                answer += myString.valueOf(tmp).toUpperCase();
            }else{
                answer += (char)tmp;
            }
        }
        return answer;
    }
}