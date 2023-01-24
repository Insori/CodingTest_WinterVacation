public class Solution99 {
    public String solution(String bin1, String bin2) {
        //toBinaryString(int i) - 10진수를 2진수로 변환
        //parseInt(String s, int radix) - (radix)진수로 읽어서 10진수로 변환
        String answer = Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));
        return answer;
    }
}
