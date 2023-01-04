// 구름에듀 COS PRO 2급 3차시
// 7. 남은 재료로 주스 만들기
public class Solution28 {
    public int solution(int numApple, int numCarrot, int k) {
        int answer = 0;

        if(numApple < 3 * numCarrot)
            answer = numApple / 3;
        else
            answer = numCarrot;

        numApple -= 3 * answer;
        numCarrot -= answer;

        for(int i = 0; k - (numApple + numCarrot + i) > 0; i++)
            if(i % 4 == 0)
                answer--;
        return answer;
    }
}
