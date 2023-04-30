class Solution {
    public int solution(int n, String control) {
        int answer = n;
        String [] list = control.split("");
        for(int i = 0; i < list.length; i++){
            if (list[i].equals("w")){
                answer += 1;
            }else if (list[i].equals("s")){
                answer -= 1;
            }else if (list[i].equals("d")){
                answer += 10;
            }else if (list[i].equals("a")){
                answer -= 10;
            }
        }
        return answer;
    }
}