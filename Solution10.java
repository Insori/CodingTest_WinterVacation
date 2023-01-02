// 구름에듀 COS PRO 2급 1차시
// 9. 중복 문자 삭제하기
public class Solution10 {
    public String solution(String characters){
        String result = "";
        result += characters.charAt(0);
        for (int i = 1; i < characters.length(); i++) {
            if (characters.charAt(i - 1) != characters.charAt(i))
                result += characters.charAt(i);
        }
        return result;
    }
}
