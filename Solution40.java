// 구름에듀 COS PRO 2급 4차시
// 10. XX시험 합격자 수 구하기
public class Solution40 {
    public int solution(int[] scores, int cutline) {
        int answer = 0;
        for(int i=0; i<scores.length; i++) {
            if(scores[i] >= cutline) answer++;
        }
        return answer;
    }
}
