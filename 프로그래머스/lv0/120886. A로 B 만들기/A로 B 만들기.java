import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] beforeC = before.toCharArray();
        char[] afterC = after.toCharArray();
        
        Arrays.sort(beforeC);
        Arrays.sort(afterC);
        
        String resultB = new String(beforeC);
        String resultA = new String(afterC);
        
        if(resultB.equals(resultA)){
            answer = 1;
        }else{
            answer = 0;
        }
        return answer;
    }
}