// 구름에듀 COS PRO 2급 3차시
// 8. TV 애청자 A씨
public class Solution29 {
    public int solution(int[][] programs) {

        int answer = 0;
        int[] usedTv = new int[25];

        for(int i = 0; i < programs.length; i++)
            for(int j = programs[i][0]; j < programs[i][1]; j++)
                usedTv[j]++;

        for(int i = 0; i < 25; i++)
            if(usedTv[i] >= 2)
                answer++;

        return answer;
    }
}
