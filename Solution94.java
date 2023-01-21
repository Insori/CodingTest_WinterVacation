import java.util.Arrays;

public class Solution94 {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        for(int i=0; i<emergency.length; i++) {
            answer[i] = emergency[i];
        }
        Arrays.sort(emergency);
        for(int i=0; i<answer.length; i++) {
            for(int j=emergency.length-1; j>=0; j--) {
                if(answer[i] == emergency[j]) {
                    answer[i] = answer.length-j;
                    break;
                }
            }
        }
        return answer;
    }
}
