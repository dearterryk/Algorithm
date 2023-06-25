import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(String str : intStrs){
            int result = Integer.parseInt(str.substring(s,s+l));
            if(result > k){
                arr.add(result);
            }
        }
        int[] answer = new int[arr.size()];
        
        for(int i = 0; i<arr.size(); i++){
            answer[i] = arr.get(i);
        }
        
        return answer;
    }
}