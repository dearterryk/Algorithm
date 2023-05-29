class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int q = n/10;
        answer = (n*12000) + ((k-q)*2000); 
            
        
        return answer;
    }
}