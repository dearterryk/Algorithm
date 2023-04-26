class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int mul = 1;
        int count = num_list.length;
        
        for(int i = 0; i<num_list.length; i++){
            if(count >= 11){
                answer += num_list[i];
            }else {
                mul *= num_list[i];
                answer = mul;
            }
        }
        return answer;
    }
}