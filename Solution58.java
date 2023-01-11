import java.util.ArrayList;

public class Solution58 {
    public int[] solution(int n) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            if(i%2==1) arrlist.add(i);
        }
        int[] answer = new int[arrlist.size()];
        for(int i=0; i<arrlist.size(); i++) {
            answer[i] = arrlist.get(i);
        }
        return answer;
    }
}
