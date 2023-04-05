class Solution {
    public int solution(int n) {
        int answer = 0;
        Double s = Math.sqrt(n);
        if(s == s.intValue()){
            answer = 1;
        } else{
            answer = 2;
        }
        return answer;
    }
}
