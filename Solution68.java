public class Solution68 {
    public int solution(int hp) {
        int answer = 0;
        while(hp > 0) {
            if(hp >= 5) {
                answer += (hp/5);
                hp %= 5;
            }
            else if(hp >= 3) {
                answer += (hp/3);
                hp %= 3;
            }
            else if(hp >= 1){
                answer += hp;
                hp %= 1;
            }
        }
        return answer;
    }
}
