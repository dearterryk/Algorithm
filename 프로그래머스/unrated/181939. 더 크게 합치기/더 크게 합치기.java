class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String sum1 = (a+"")+(b+"");
        String sum2 = (b+"")+(a+"");
        if(Integer.parseInt(sum2) > Integer.parseInt(sum1)){
            answer = Integer.parseInt(sum2);
        }else{
            answer = Integer.parseInt(sum1);
        }
        
        return answer;
    }
}