class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String sum1= "" + a + b;
        int sum2 = 2 * a * b;
        
        if(Integer.parseInt(sum1) >= sum2){
            answer = Integer.parseInt(sum1);
        }else{
            answer = sum2;
        }
        return answer;
    }
}