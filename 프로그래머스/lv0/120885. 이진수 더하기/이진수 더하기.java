class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int num1 = Integer.parseInt(bin1,2);
        int num2 = Integer.parseInt(bin2,2);
        //Integer.parseInt(String a, int b) -> 2진수를 10진수로 변환
        
        int sum = num1 + num2;
        answer = Integer.toBinaryString(sum);
        // Integer.toBinaryString() -> 10진수를 2진수로 변환
        
        return answer;
    }
}