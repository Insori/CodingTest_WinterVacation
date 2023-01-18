public class Solution88 {
    public String solution(String letter) {
        String answer = "";
        String[] letter2 = letter.split(" ");
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(int i=0; i<letter2.length; i++) {
            for(int j=0; j<morse.length; j++) {
                if(letter2[i].equals(morse[j])) {
                    answer += (char)(j+97);
                    break;
                }
            }
        }
        return answer;
    }
}
