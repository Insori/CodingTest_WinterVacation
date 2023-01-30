public class Solution104 {
    public int solution(String my_string) {
        int answer = 0;
        my_string += "A";   //my_string이 숫자로 끝나는 경우 - 문자를 추가해줌
        int i = 0;
        String str;
        while(i < my_string.length()) {
            str = "";
            if(my_string.charAt(i) >= 49 && 57 >= my_string.charAt(i)) {
                while(my_string.charAt(i) >= 48 && 57 >= my_string.charAt(i)) {
                    str += my_string.charAt(i);
                    i++;
                }
                answer += Integer.parseInt(str);
            }
            else i++;
        }
        return answer;
    }
}
