class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int a = i; a<=j; a++){
            String num = Integer.toString(a);
            for(int b = 0; b<num.length(); b++){
                if(Integer.toString(k).equals(num.substring(b,b+1))){
                    answer++;
                }
            }
        }
        return answer;
    }
}