import java.util.ArrayList;

public class Solution92 {
    public String solution(String my_string) {
        String answer = "";
        ArrayList<Character> arrlist = new ArrayList<>();
        for(int i=0; i<my_string.length(); i++) {
            arrlist.add(my_string.charAt(i));
        }
        for(int i=0; i<arrlist.size(); i++) {
            for(int j=i+1; j<arrlist.size(); j++) {
                if(arrlist.get(i) == arrlist.get(j)) {
                    arrlist.remove(j);
                    j--;
                }
            }
        }
        for(int i=0; i<arrlist.size(); i++) {
            answer += arrlist.get(i);
        }
        return answer;
    }
}
