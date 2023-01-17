public class Solution84 {
    public int solution(int num, int k) {
        int answer = 0;
        int count = 0;
        int num2 = num;
        while(num2 > 0) {   //num이 몇 자리 수인지 구하기
            num2 /= 10;
            count++;
        }
        while(num > 0) {
            if(num%10 == k) {   //k가 있는 자리(count)를 answer에 넣기
                answer = count;
                count--;    //앞에 k가 중복 존재할 수 있으므로 똑같이 count--하기
            }
            else count--;
            num/=10;
        }
        if(answer == 0) answer = -1;
        return answer;
    }
}
