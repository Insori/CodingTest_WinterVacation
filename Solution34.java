// 구름에듀 COS PRO 2급 4차시
// 3. 획득 점수 구하기. 도박은 안 돼요
public class Solution34 {
    String func_a(String bundle, int start, int n) {
        String answer = "";
        for(int i=0; i<n; i++)
            answer += bundle.charAt(start+i*2);
        return answer;
    }
    int[] func_b(int score1, int score2) {
        int[] answer = new int[2];
        if(score1 > score2) {
            answer[0] = 1;
            answer[1] = score1;
        }
        else if(score1 < score2) {
            answer[0] = 2;
            answer[1] = score2;
        }
        else {
            answer[0] = 0;
            answer[1] = score1;
        }
        return answer;
    }
    int func_c(String card) {
        int answer = 0;
        for(int i = 0; i < card.length(); i++) {
            answer += card.charAt(i) - 'a' + 1;
        }
        return answer;
    } // 에러 방지 함수

    int[] solution(int n, String bundle) {
        String aCards = func_a(bundle, 0, n);
        String bCards = func_a(bundle, 1, n);
        int aScore = func_c(aCards);
        int bScore = func_c(bCards);
        int[] answer = func_b(aScore, bScore);
        return answer;
    }
}
