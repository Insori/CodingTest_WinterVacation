import java.util.Arrays;

public class Solution93 {
    public int solution(String before, String after) {
        int answer = 1;
        char[] b = new char[before.length()];
        char[] a = new char[after.length()];
        for(int i=0; i<b.length; i++) {
            b[i] = before.charAt(i);
            a[i] = after.charAt(i);
        }
        Arrays.sort(b);
        Arrays.sort(a);
        for(int i=0; i<b.length; i++) {
            if(b[i] != a[i]) {
                answer = 0;
                break;
            }
        }
        return answer;
    }
}
