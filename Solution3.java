// 구름에듀 COS PRO 2급 1차시
// 2. 쇼핑몰 등급별 할인 금액 구하기
public class Solution3 {
    public int solution(int price, String grade) {
        int answer = price;
        if(grade.equals("S")) answer -= price * 0.05;
        else if(grade.equals("G")) answer -= price * 0.1;
        else if(grade.equals("V")) answer -= price * 0.15;

        return answer;
    }
}
