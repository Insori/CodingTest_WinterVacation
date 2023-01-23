import java.util.ArrayList;

public class Solution97 {
    public int[] solution(int n) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        for(int i=2; i<=n; i++) {
            if(n%i==0) {
                arrlist.add(i);
                while(n%i==0) {
                    n/=i;
                }
            }
        }
        int[] answer = new int[arrlist.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = arrlist.get(i);
        }
        return answer;
    }
}
