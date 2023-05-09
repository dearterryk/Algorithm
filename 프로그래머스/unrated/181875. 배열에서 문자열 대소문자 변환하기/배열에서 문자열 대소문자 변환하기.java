class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        int cnt = 0;
        for(int i = 0; i<strArr.length; i++){
            cnt ++;
            if(cnt % 2 != 0){
                answer[i] = strArr[i].toLowerCase();
            }else{
                answer[i] = strArr[i].toUpperCase();
            }
        }
        return answer;
    }
}