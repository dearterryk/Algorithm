class Solution {
    public int[] solution(int money) {
        int[] answer = new int [2];
        int coffee = 5500;
        int q = money/coffee;
        for(int i = 0; i<answer.length-1; i++){
            answer[i] = q;
            answer[i+1] = money-(coffee*q);
        }
        
        return answer;
    }
}