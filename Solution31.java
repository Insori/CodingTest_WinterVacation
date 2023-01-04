// 구름에듀 COS PRO 2급 3차시
// 10. 내 절반이 여기에 있는가?
public class Solution31 {
    public int solution(int[] arr) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length; j++)
                if (arr[i]%2 == 0 && arr[i]/2 == arr[j]) {
                    answer++;
                    continue;
                }
        return answer;
    }
}

