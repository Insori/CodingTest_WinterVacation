// 구름에듀 COS PRO 2급 4차시
// 6. 열심히 모은 point, 돌려드립니다.
public class Solution37 {
    public int solution(int point) {
        if (point < 1000)
            return 0;
        return point / 100 * 100;
    }
}
