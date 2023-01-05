// 구름에듀 COS PRO 2급 4차시
// 7. 오른 점수와 떨어진 점수 구하기
public class Solution38 {
    int func_a(int scores1[], int scores2[]) {
        int answer = 0;
        for(int i=0; i<scores1.length; i++)
            if (answer < scores2[i] - scores1[i])
                answer = scores2[i] - scores1[i];
        return answer;
    }

    int func_b(int scores1[], int scores2[]) {
        int answer = 0;
        for(int i=0; i<scores1.length; i++)
            if (answer > scores2[i] - scores1[i])
                answer = scores2[i] - scores1[i];
        return answer;
    }

    public int[] solution(int[] midScores, int[] finalScores) {
        int[] answer = {0, 0};
        answer[0] = func_a(midScores, finalScores);
        answer[1] = func_b(midScores, finalScores);
        return answer;
    }
}
