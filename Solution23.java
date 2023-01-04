// 구름에듀 COS PRO 2급 3차시
// 2. 장학생 수 구하기
public class Solution23 {
    public int func_a(int[] currentGrade, int[] lastGrade, int[] rank, int maxDiffGrade) {
        int arrLength = currentGrade.length;
        int count = 0;
        for (int i = 0; i < arrLength; i++) {
            if (currentGrade[i] >= 80 && rank[i] <= arrLength / 10)
                count++;
            else if (currentGrade[i] >= 80 && rank[i] == 1)
                count++;
            else if (maxDiffGrade == currentGrade[i] - lastGrade[i])
                count++;
        }
        return count;
    }
    public int[] func_b(int[] currentGrade) {
        int arrLength = currentGrade.length;
        int[] rank = new int[arrLength];
        for (int i = 0; i < arrLength; i++)
            rank[i] = 1;
        for (int i = 0; i < arrLength; i++)
            for (int j = 0; j < arrLength; j++)
                if (currentGrade[i] < currentGrade[j])
                    rank[i]++;
        return rank;
    }
    public int func_c(int[] currentGrade, int[] lastGrade) {
        int maxDiffGrade = 1;
        for (int i = 0; i < currentGrade.length; i++) {
            if (maxDiffGrade < currentGrade[i] - lastGrade[i])
                maxDiffGrade = currentGrade[i] - lastGrade[i];
        }
        return maxDiffGrade;
    }   //에러 방지 함수
    
    public int solution(int[] currentGrade, int[] lastGrade) {
        int[] rank = func_b(currentGrade);
        int maxDiffGrade = func_c(currentGrade, lastGrade);
        int answer = func_a(currentGrade, lastGrade, rank, maxDiffGrade);
        return answer;
    }
}
