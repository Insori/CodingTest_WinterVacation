public class Solution102 {
    public int[] solution(int num, int total) {
        int sum;
        int i;
        for(i=(0-total)-num; i<=total; i++) {
            sum = 0;
            for(int j=0; j<num; j++) {
                sum += (i+j);
            }
            if(sum == total) break;
        }
        int[] answer = new int[num];
        for(int j=0; j<answer.length; j++) {
            answer[j] = i++;
        }
        return answer;
    }
}
