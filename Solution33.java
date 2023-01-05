// 구름에듀 COS PRO 2급 4차시
// 2. 시험 합격자가 몇명이지?
public class Solution33 {
    public int func_a(int passed, int non_passed) {
        if (passed > 1 && non_passed == 0)
            return 1;
        return 0;
    }
    public int func_b(int[] scores) {
        int answer = 0;
        if(scores[0] < 40) {
            answer++;
        }
        if(scores[1] < 44) {
            answer++;
        }
        if(scores[2] < 35) {
            answer++;
        }
        return answer;
    }
    public int func_c(int[] scores) {
        int answer = 0;
        if (scores[0] >= 80) {
            answer++;
        }
        if (scores[1] >= 88) {
            answer++;
        }
        if (scores[2] >= 70) {
            answer++;
        }
        return answer;
    } // 에러 방지 함수

    public int solution(int[][] scores) {
        int answer = 0;
        for(int i = 0; i<scores.length; i++) {
            int passed = func_c(scores[i]);
            int nonPassed = func_b(scores[i]);
            answer += func_a(passed, nonPassed);
        }
        return answer;
    }
}
