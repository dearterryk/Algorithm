class Solution {
    public int[] solution(int[] arr) {
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        int[] answer = new int[sum];
        int temp = 0;
        
        for(int i = 0, j = 0; j<answer.length; j++){
            if(temp < arr[i]){
                answer[j] = arr[i];
                temp++;
            }else{
                temp = 0;
                j--;
                i++;
            }
        }
        
        return answer;
    }
}