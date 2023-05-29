class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        int result = n/slice;  //몫,판수
        if(n % slice == 0){
            answer = result;
        }else{
            answer = result+1;
        }
        return answer;
    }
}