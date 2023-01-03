// 구름에듀 COS PRO 2급 2차시
// 3. 짝수들의 제곱의 합 구하기
public class Solution14 {
    public int solution(int N, int M) {
        int sum = 0;
        for(int i = N; i <= M; i++) {
            if(i % 2 == 0) sum += i * i;
        }
        int answer = sum;

        return answer;
    }
}
