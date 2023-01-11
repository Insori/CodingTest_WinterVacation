public class Solution63 {
    public int solution(String str1, String str2) {
        int answer = 2;
        if(str1.contains(str2)) answer = 1; //contains(): 특정 문자열을 포함하고 있는지 확인
        return answer;
    }
}
