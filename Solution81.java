import java.util.*;

public class Solution81 {
    public int[] solution(int n) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            if(n%i==0) arrlist.add(i);
        }
        int[] answer = new int[arrlist.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = arrlist.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
