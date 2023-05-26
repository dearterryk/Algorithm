import java.util.*;

class Solution {
    public List<String> solution(String my_string) {
        List<String> answer = new ArrayList<>();
        int size = my_string.length();
        String tmp = "";
        
        for(int i = 1; i<=size; i++){
            tmp = my_string.substring(size-i,size);
            answer.add(tmp);
        }
        
        Collections.sort(answer);
        return answer;
    }
}