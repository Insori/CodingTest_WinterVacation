import java.util.Arrays;

public class Solution55 {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        if((sides[0]+sides[1]) > sides[2]) answer = 1;
        else answer = 2;
        return answer;
    }
}