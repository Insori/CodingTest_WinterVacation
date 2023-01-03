// 구름에듀 COS PRO 2급 2차시
// 7. 섭씨, 화씨 온도 바꾸기
public class Solution18 {
    public int solution(int value, String unit) {
        int converted = 0;
        if (unit.equals("C"))
            converted = (int)(value * 1.8 + 32);
        if (unit.equals("F"))
            converted = (int)((value - 32) / 1.8);
        return converted;
    }
}
