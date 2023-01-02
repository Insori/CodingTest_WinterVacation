// 구름에듀 COS PRO 2급 1차시
// 10. 평균 이하의 개수 구하기
public class Solution11 {
    public int solution(int[] data) {
        double total = 0;
        int len = data.length;
        for(int i = 0; i < len; i++)
            total += data[i];
        int cnt = 0;
        double average = total / len;
        for(int i = 0; i < len; i++)
            if (data[i] <= average)
                cnt += 1;
        return cnt;
    }
}
