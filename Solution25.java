// 구름에듀 COS PRO 2급 3차시
// 4. 단어의 오타 수정하기
public class Solution25 {
    public int solution(String[] words, String word) {
        int count = 0;
        for(int i=1; i<words.length; i++) {
            for(int j=0; j<words[i].length(); j++) {
                if(words[0].charAt(j) != words[i].charAt(j)) count++;
            }
        }
        return count;
    }
}
