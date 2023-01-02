// 구름에듀 COS PRO 2급 1차시
// 6. 369 게임 박수의 갯수 구하기
public class Solution7 {
    public int solution(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            int current = i;
            int temp = count;
            while (current != 0) {
                if (current % 10 == 3 || current % 10 == 6 || current % 10 == 9){
                    count++;
                }
                current /= 10;
            }
        }
        return count;
    }
}
