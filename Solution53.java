public class Solution53 {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int i=1;
        if(money < 5500) {
            answer[0] = 0;
            answer[1] = money;
        }
        else {
            while(true) {
                if(money - (5500*i) >= 5500) {
                    i++;
                }
                else {
                    answer[0] = i;
                    answer[1] = money - (5500*i);
                    break;
                }
            }
        }
        return answer;
    }
}
