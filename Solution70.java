public class Solution70 {
    public int solution(int n, int t) {
        int answer = 0;
        for(int i=1; i<=t; i++) {
            answer = n*2;
            n *= 2;
        }
        return answer;
    }
}