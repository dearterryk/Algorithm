class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String case1 = myString.toUpperCase();
        String case2 = pat.toUpperCase();
        
        if(case1.contains(case2)){
            answer = 1;
        }else{
            answer = 0;
        }
        return answer;
    }
}