class Solution {
    public int solution(String message) {
        int answer = 0;
        String s = message;
        int s_len = s.length();
        for(int i = 1; i<=s_len; i++){
            answer +=2;
        }
        return answer;
    }
}