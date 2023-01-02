// 구름에듀 COS PRO 2급 1차시
// 3. 시작 날짜와 끝 날짜의 사이 날짜 구하기
public class Solution4 {
    public int func_a(int month, int day){
        int monthList[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int total = 0;
        for(int i = 0; i < month-1; i++)
            total += monthList[i];
        total += day;
        return total - 1;
    }
}
