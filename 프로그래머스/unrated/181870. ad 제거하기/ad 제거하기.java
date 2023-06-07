import java.util.*;

class Solution {
    public List solution(String[] strArr) {
        ArrayList<String> answer = new ArrayList<>();
        for(int i =0; i<strArr.length; i++){
            answer.add(strArr[i]);
        }
        
        for(int i = 0; i<strArr.length; i++){
            if(strArr[i].contains("ad")){
                answer.remove(strArr[i]);
            }
        }

        return answer;
    }
}