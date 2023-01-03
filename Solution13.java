// 구름에듀 COS PRO 2급 2차시
// 2. 더 많은 배수 구하기
public class Solution13 {
    public int func_a(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; ++i)
            if (arr[i] % 5 == 0)
                count += 1;
        return count;
    }
    public String func_b(int three, int five){
        if (three > five)
            return "three";
        else if (three < five)
            return "five";
        else
            return "same";
    }
    public int func_c(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; ++i)
            if (arr[i] % 3 == 0)
                count += 1;
        return count;
    }
    // ^ 에러 방지 함수

    public String solution(int[] arr) {
        int countThree = func_c(arr);
        int countFive = func_a(arr);
        String answer = func_b(countThree, countFive);
        return answer;
    }
}
