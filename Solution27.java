// 구름에듀 COS PRO 2급 3차시
// 6. 타일 색칠 방법 구하기
public class Solution27 {
    public String solution(int tileLength) {
        String answer = "";
        String com = "RRRGGB";
        if(tileLength%6 == 1 || tileLength%6 == 2 || tileLength%6 == 4)
            answer = "-1";
        else
            for(int i = 0; i < tileLength; i++)
                answer += com.charAt(i%6);
        return answer;
    }
}
