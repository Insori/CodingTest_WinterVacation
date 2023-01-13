import java.util.ArrayList;

public class Solution67 {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        for(int i=0; i<numlist.length; i++) {
            if(numlist[i]%n == 0) arrlist.add(numlist[i]);
        }
        int[] answer = new int[arrlist.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = arrlist.get(i);
        }
        return answer;
    }
}
