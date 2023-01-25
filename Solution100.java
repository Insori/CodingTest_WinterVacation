public class Solution100 {
    public String[] solution(String my_str, int n) {
        int len;
        if(my_str.length()%n!=0)
            len = (my_str.length()/n)+1;
        else
            len = my_str.length()/n;
        String[] answer = new String[len];
        int k=0;
        String str;
        for(int i=0; i<answer.length; i++) {
            str = "";
            for(int j=1; j<=n; j++) {
                if(k == my_str.length()) break;
                str += my_str.charAt(k++);
            }
            answer[i] = str;
        }
        return answer;
    }
}
