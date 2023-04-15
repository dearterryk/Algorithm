class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int maxNum = 0;
        int maxIndex = 0;
        for(int i = 0; i <array.length; i++){
            if(array[i] > maxNum){
                maxNum = array[i];
                maxIndex = i;
            }
        }
        answer[0] = maxNum;
        answer[1] = maxIndex;
        return answer;
    }
}