// 구름에듀 COS PRO 2급 1차시
// 8. 팰린드롬 판단하기
public class Solution9 {
    boolean solution(String sentence){
        String str = "";
        for(int i = 0; i < sentence.length(); i++){
            char c = sentence.charAt(i);
            if(c != ' ' && c != '.') str += c;
        }
        int len = str.length();
        for(int i = 0; i < len / 2; i++){
            if(str.charAt(i) != str.charAt(len - 1 - i)) return false;
        }
        return true;
    }
}
