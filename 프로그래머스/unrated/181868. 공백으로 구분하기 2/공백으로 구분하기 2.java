import java.util.*;

class Solution {
    public List solution(String my_string) {
        String[] arr = my_string.split("\\s");
        ArrayList<String> answer = new ArrayList<>();
        
        for(int i = 0; i<arr.length; i++){
            if(!arr[i].equals("")){
                answer.add(arr[i]);
            }
        }
        return answer;
    }
}