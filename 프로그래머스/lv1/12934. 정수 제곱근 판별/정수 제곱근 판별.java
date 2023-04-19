import java.util.*; 

class Solution {
    public long solution(long n) {
        long answer = 0;
        Double s = Math.sqrt(n);
        if(s == s.intValue()){
            answer = (long)Math.pow(s + 1,2);
        }else{
            answer = -1;
        }
        
        return answer;
    }
}