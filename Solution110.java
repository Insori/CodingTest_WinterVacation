public class Solution110 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max = 0;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=m; j++) {
                if(n%i==0 && m%j==0 && i==j) max = j;
            }
        }
        answer[0] = max;
        answer[1] = (n*m)/max;
        return answer;
    }
}
