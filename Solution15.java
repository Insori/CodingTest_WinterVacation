// 구름에듀 COS PRO 2급 2차시
// 4. 5글자 이상인 단어 배열하기
public class Solution15 {
    public String solution(String[] words) {
        String answer = "";
        for(int i = 0; i < words.length; i++) {
            if(words[i].length() >= 5) answer += words[i];
        }
        if(answer.equals("")) answer = "empty";

        return answer;
    }
}
