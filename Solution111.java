import java.util.ArrayList;
import java.util.Collections;

public class Solution111 {
    public long solution(long n) {
        long answer = 0;
        ArrayList<Long> arr = new ArrayList<>();
        while(n > 0) {
            arr.add(n%10);
            n /= 10;
        }
        Collections.sort(arr);  //ArrayList 정렬
        int j=1;
        for(int i=0; i<arr.size(); i++) {
            answer += (arr.get(i)*j);
            j *= 10;
        }
        return answer;
    }
}
