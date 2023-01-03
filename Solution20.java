// 구름에듀 COS PRO 2급 2차시
// 9. 중복문자 삭제하기
public class Solution20 {
    public int solution(int[] votes, int N, int K) {
        int[] counter = new int[N + 1];
        for(int i = 0; i < votes.length; ++i)
            counter[votes[i]] += 1;
        int answer = 0;
        for(int i = 0; i <= N; ++i)
            if(counter[i] == K)
                answer += 1;
        return answer;
    }
}
