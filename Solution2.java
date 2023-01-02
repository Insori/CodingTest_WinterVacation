// 구름에듀 COS PRO 2급 1차시
// 1. 단체 티셔츠를 주문하기
public class Solution2 {
    public int[] solution(String[] shirtSize) {
        int[] answer = {0, 0, 0, 0, 0, 0};
        for(int i=0; i<shirtSize.length; i++) {
            if(shirtSize[i].equals("XS")) answer[0]++;
            else if(shirtSize[i].equals("S")) answer[1]++;
            else if(shirtSize[i].equals("M")) answer[2]++;
            else if(shirtSize[i].equals("L")) answer[3]++;
            else if(shirtSize[i].equals("XL")) answer[4]++;
            else if(shirtSize[i].equals("XXL")) answer[5]++;
        }
        return answer;
    }
}
