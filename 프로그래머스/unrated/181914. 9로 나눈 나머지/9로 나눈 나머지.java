class Solution {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        String[] arr = String.valueOf(number).split("");
        
        for(int i = 0; i<arr.length; i++){
            sum += Integer.parseInt(arr[i]);
        }
        
        answer = sum % 9;
        
        return answer;
    }
}