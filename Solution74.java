public class Solution74 {
    public int solution(int[] box, int n) {
        int answer = 0;
        if(box[0] >= n && box[1] >= n && box[2] >= n)
            answer = (box[0]/n)*(box[1]/n)*(box[2]/n);
        return answer;
    }
}
