// 구름에듀 COS PRO 2급 3차시
// 1. 학생의 등수 구하기
import java.util.Arrays;

public class Solution22 {
    int func_a(int[] scores, int score){
        int length = scores.length;
        for(int rank = 0; rank < length; rank++)
            if(scores[rank] == score)
                return rank + 1;
        return 0;
    }
    void func_b(int[] arr){
        Arrays.sort(arr);
        int length = arr.length;
        int temp = 0;
        for(int i = 0; i < length / 2; i++){
            temp = arr[i];
            arr[i] = arr[(length - 1) - i];
            arr[(length - 1) - i] = temp;
        }
    }
    int func_c(int[] arr, int n){
        return arr[n];
    }   //에러 방지 함수

    public int solution(int[] scores, int n) {
        int score = func_c(scores, n);
        func_b(scores);
        int answer = func_a(scores, score);
        return answer;
    }
}
