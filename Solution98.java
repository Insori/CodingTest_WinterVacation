import java.util.Arrays;

public class Solution98 {
    public String solution(String s) {
        String answer = "";
        String s2 = s;
        int one;    //한 번만 등장했는지 판별하기 위함
        for(int i=0; i<s.length(); i++) {
            one = 0;
            for(int j=0; j<s2.length(); j++) {
                if(j == i) continue;    //i 위치의 문자는 건너뛰기
                if(s.charAt(i) == s2.charAt(j)) {
                    one = 1;
                    break;
                }
            }
            if(one == 0) answer += s.charAt(i);
        }
        //배열에 옮겨서 오름차순 정렬하기
        char[] ch = new char[answer.length()];
        for(int i=0; i<ch.length; i++) {
            ch[i] = answer.charAt(i);
        }
        Arrays.sort(ch);

        answer = "";
        for(int i=0; i<ch.length; i++) {
            answer += ch[i];
        }
        return answer;
    }
}
