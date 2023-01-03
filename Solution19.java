// 구름에듀 COS PRO 2급 2차시
// 8. 팰린드롬 판단하기
public class Solution19 {
    public int solution(int number) {
        int count = 0;
        while(number > 0){
            int n = number % 10;
            if (n == 2 || n == 3 || n == 5 || n == 7)
                count += 1;
            number /= 10;
        }
        return count;
    }
}
