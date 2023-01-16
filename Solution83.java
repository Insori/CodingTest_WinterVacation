public class Solution83 {
    public String solution(int age) {
        String answer = "";
        while(age > 0) {
            answer = (char)((age % 10) + 97) + answer;
            age /= 10;
        }
        return answer;
    }
}
