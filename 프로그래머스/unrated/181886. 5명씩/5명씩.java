import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        ArrayList<String> answer = new ArrayList<>();
        
        for(int i = 0, j = 0; i< names.length; i++){
            if(i % 5 == 0){
                answer.add(names[i]);
                j++;
            }
        }
        
        return answer.toArray(String[]::new);
    }
}