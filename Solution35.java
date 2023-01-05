// 구름에듀 COS PRO 2급 4차시
// 4. 조교의 수 구하기
public class Solution35 {
    public int solution(int[] classes, int m) {
        int answer = 0;
        for(int i=0; i<classes.length; i++) {
            answer += classes[i] / m;
            if (classes[i] % m != 0)
                answer++;
        }
        return answer;
    }
}
