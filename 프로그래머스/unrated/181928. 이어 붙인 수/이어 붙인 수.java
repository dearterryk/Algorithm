class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String tmp1 = "";
        String tmp2 = "";
        for(int i = 0; i<num_list.length; i ++){
            if(num_list[i] % 2 != 0){
                tmp1 += num_list[i]+"";
            } else{
                tmp2 += num_list[i]+"";
            }
        }
        answer = Integer.parseInt(tmp1) + Integer.parseInt(tmp2);
        return answer;
    }
}