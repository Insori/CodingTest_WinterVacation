// 구름에듀 COS PRO 2급 1차시
// 7. 영어 수강 대상자 수 구하기
public class Solution8 {
    public int solution(int[] scores) {
        int count = 0;
        for (int i = 0; i < scores.length; i++)
            if (650 <= scores[i] && scores[i] < 800)
                count += 1;
        return count;
    }
}
