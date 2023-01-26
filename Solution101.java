public class Solution101 {
    public int solution(int chicken) {
        int answer = 0;
        while(chicken >= 10) {
            int c1 = chicken/10;
            answer += c1;
            chicken %= 10;
            chicken += c1;
        }
        return answer;
    }
}
