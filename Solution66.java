public class Solution66 {
    public int solution(String my_string) {
        int answer = 0;
        for(int i=0; i<my_string.length(); i++) {
            //아스키 코드에서 0~9가 48 ~ 57
            if(my_string.charAt(i) >= 49 && my_string.charAt(i) <= 57) {
                answer += (my_string.charAt(i) - '0');  //올바른 자연수가 나오도록 48을 빼줌
            }
        }
        return answer;
    }
}
