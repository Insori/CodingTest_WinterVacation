import java.util.*;

public class Solution77 {
    public int[] solution(String my_string) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        //48 ~ 57
        for(int i=0; i<my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if(ch >= 48 && ch <= 57) arrlist.add((int)(ch-48));
        }
        int[] answer = new int[arrlist.size()];
        for(int i=0; i<arrlist.size(); i++) {
            answer[i] = arrlist.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
