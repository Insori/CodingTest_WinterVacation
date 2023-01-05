// 구름에듀 COS PRO 2급 4차시
// 1. 상담 선생님은 너무 바빠요
public class Solution32 {
    public int[] solution(String[] schedule) {
        int xCount = 0;
        for (int i = 0; i < 10; i++)
            if (schedule[i].charAt(0) == 'X')
                xCount++;

        int[] answer = new int[xCount];
        for (int i = 0, j = 0; i < 10; i++) {
            if (schedule[i].charAt(0) == 'X') {
                answer[j++] = i + 1;
            }
        }
        return answer;
    }
}
