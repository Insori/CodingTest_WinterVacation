public class Solution103 {
    public int solution(int[] numbers, int k) {
        int current = 0;
        int answer = numbers[current];
        for(int i=1; i<k; i++) {
            if(current+2 > numbers.length-1) {
                current += 2;
                current -= numbers.length;
            } else current += 2;
            answer = numbers[current];
            System.out.println(numbers[current]);
        }
        return answer;
    }
}
