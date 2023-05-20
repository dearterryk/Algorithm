class Solution {
    public String solution(String myString) {
        String answer = "";
        char tmp;
        for(int i = 0; i<myString.length(); i++){
            tmp = myString.charAt(i);
            if(tmp == 'a' || tmp == 'A'){
                answer += "A";
            }else{
                answer += myString.valueOf(tmp).toLowerCase();
            }
        }
        return answer;
    }
}