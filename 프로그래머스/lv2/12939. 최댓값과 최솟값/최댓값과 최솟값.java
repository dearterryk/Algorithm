import java.util.*;

class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
        int[] numbers = new int[str.length];
        
        for(int i = 0; i < str.length; i++){
            numbers[i] = Integer.parseInt(str[i]);
        }
        
        Arrays.sort(numbers);
        
        int min = numbers[0];
        int max = numbers[numbers.length-1];
        
        return min + " " + max;
    }
}