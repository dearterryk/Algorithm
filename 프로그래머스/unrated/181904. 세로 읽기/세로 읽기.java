class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int startIdx = c-1;
        for(int i = startIdx; i<my_string.length(); i+=m){
            answer += my_string.substring(startIdx,startIdx+1);
            startIdx += m;
        }
        return answer;
    }
}