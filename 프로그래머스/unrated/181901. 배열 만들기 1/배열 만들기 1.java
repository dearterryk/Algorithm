class Solution {
    public int[] solution(int n, int k) {
        int quo = n / k;
        int tmp = k;
        int[] answer = new int[quo];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = tmp;
            tmp += k;
        }
        return answer;
    }
}