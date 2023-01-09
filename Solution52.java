public class Solution52 {
    public int solution(int slice, int n) {
        int answer = 0;
        int p = 1;
        while(true) {
            if(slice*p >= n) {
                answer = p;
                break;
            }
            else {
                p++;
            }
        }
        return answer;
    }
}
