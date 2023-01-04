// 구름에듀 COS PRO 2급 3차시
// 9. 주차장에 몇 대가 들어올 수 있는 거야?
public class Solution30 {
    public int solution(int day, int[] numbers) {
        int count = 0;
        for(int i = 0; i < numbers.length; i++)
            if(numbers[i]%2 == day%2)
                count++;
        return count;
    }
}
