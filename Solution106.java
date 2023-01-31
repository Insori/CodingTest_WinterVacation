public class Solution106 {
    boolean solution(String s) {
        boolean answer = true;
        int[] py = new int[2];
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P') py[0]++;
            else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') py[1]++;
        }
        if(py[0] != py[1]) answer = false;
        return answer;
    }
}
