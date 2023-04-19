import java.util.Arrays;

class Solution {
    public int[] solution(long n) {
        String [] arr = String.valueOf(n).split("");
        //1,2,3,4,5
        int[] answer = new int [arr.length];
        for(int i = arr.length-1, j = 0; i >= 0; i--){
            answer[j] = Integer.parseInt(arr[i]);
            j++;
        }
        return answer;
    }
}