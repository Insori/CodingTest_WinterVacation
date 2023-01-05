// 구름에듀 COS PRO 2급 4차시
// 8. 누가 반장이 될까요?
public class Solution39 {
    public int solution(int n, int[] votes) {
        int[] arr = new int[n+1];
        for(int i=0; i<votes.length; i++) {
            arr[votes[i]]++;
        }
        for(int i=1; i<n+1; i++)
            if(arr[i] > votes.length/2)
                return i;
        return -1;
    }
}
