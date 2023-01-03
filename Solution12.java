// 구름에듀 COS PRO 2급 2차시
// 1. 최대한 많은 쌍의 장갑 갯수 구하기
public class Solution12 {
    final int maxProductNumber = 10;    //에러 방지
    public int[] func_a(int[] gloves){
        int[] counter = new int[maxProductNumber + 1];
        for(int i = 0; i < gloves.length; i++)
            counter[i]++;
        return counter;
    }
}
