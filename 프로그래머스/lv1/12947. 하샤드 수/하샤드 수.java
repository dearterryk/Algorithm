class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String str = String.valueOf(x);
        String[] numberArr = str.split("");
        int sum = 0;
        
        for(String num : numberArr) {
            sum += Integer.parseInt(num);
        }
        answer = (x% sum == 0? true :false);

        return answer;
    }
}