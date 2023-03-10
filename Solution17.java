// 구름에듀 COS PRO 2급 2차시
// 6. 엘리베이터의 총 이동거리 구하기
public class Solution17 {
    public int solution(int[] floors) {
        int dist = 0;
        int length = floors.length;
        for(int i = 1; i < length; ++i){
            if(floors[i] > floors[i-1])
                dist += floors[i] - floors[i-1];
            else
                dist += floors[i-1] - floors[i];
        }
        return dist;
    }
}
