class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pCnt = 0;
        int yCnt = 0;
        char c = ' ';
        s = s.toLowerCase();
        
        for(int i = 0; i < s.length(); i++){
            c = s.charAt(i);
            
            if(c == 'p'){
                pCnt ++;
            }else if( c == 'y'){
                yCnt ++;
            }
        }
        
        if(pCnt == yCnt){
            answer = true;
        } else{
            answer = false;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(answer);

        return answer;
    }
}