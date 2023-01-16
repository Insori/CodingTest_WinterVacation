public class Solution82 {
    public int solution(int[] numbers) {
        int answer = numbers[0]*numbers[1];
        for(int i=0; i<numbers.length; i++) {
            for(int j=0; j<numbers.length; j++) {
                if(j == i) continue;
                if(numbers[i] * numbers[j] > answer) answer = numbers[i]*numbers[j];
            }
        }
        return answer;
    }
}
