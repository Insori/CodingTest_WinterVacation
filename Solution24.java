// 구름에듀 COS PRO 2급 3차시
// 3. 체조 선수의 점수 구해주기
import java.util.Arrays;

public class Solution24 {
    public int solution(int[] scores) {
        Arrays.sort(scores);
        int sum = 0;
        int length = scores.length;
        for(int i=1; i<length-1; i++) {
            sum += scores[i];
        }
        int answer = sum/(length-2);
        return answer;
    }
}
