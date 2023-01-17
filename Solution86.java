import java.util.Arrays;

public class Solution86 {
    public String solution(String my_string) {
        String answer = "";
        char[] ch1 = new char[my_string.length()];
        for(int i=0; i<my_string.length(); i++) {
            char ch2 = my_string.charAt(i);
            if(ch2 >= 65 && ch2 <= 90)
                ch1[i] = (char)(ch2 + 32);
            else ch1[i] = ch2;
        }
        Arrays.sort(ch1);
        for(int i=0; i<ch1.length; i++) {
            answer += ch1[i];
        }
        return answer;
    }
}
