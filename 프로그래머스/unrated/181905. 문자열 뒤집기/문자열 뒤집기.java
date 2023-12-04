import java.util.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String str = my_string.substring(s,e+1); // 잘라낼 문자열 추출
        
        StringBuffer sb = new StringBuffer(str);
        String reverseStr = sb.reverse().toString();
        
        answer = my_string.replaceAll(str,reverseStr);
        
        return answer;
    }
}