// 구름에듀 COS PRO 2급 4차시
// 5. A씨의 추가 운동 여부 알려주기
public class Solution36 {
    public int solution(int[] calorie) {
        int minCal = calorie[0];
        int answer = 0;
        for(int i=1; i<calorie.length; i++) {
            if(calorie[i] > minCal)
                answer += calorie[i] - minCal;
            else
                minCal = calorie[i];
        }
        return answer;
    }
}
