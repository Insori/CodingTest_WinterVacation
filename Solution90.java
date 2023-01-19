import java.util.Arrays;

public class Solution90 {
    public int solution(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);
        int num = n;
        for(int i=0; i<array.length; i++) {
            if(Math.abs(n-array[i]) < num) {
                num = Math.abs(n-array[i]);
                answer = array[i];
            }
        }
        return answer;
    }
}
