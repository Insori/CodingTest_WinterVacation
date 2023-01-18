public class Solution89 {
    public int solution(int n) {
        int answer = 0;
        int a;
        for(int i=1; i<=n; i++) {
            a=1;
            for(int j=i; j>=1; j--) {
                a *= j;
            }
            if(a <= n) {
                answer = i;
            }
            else break;
        }
        return answer;
    }
}
