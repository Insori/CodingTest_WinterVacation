// 구름에듀 COS PRO 2급 1차시
// 5. 배열의 순서 뒤집기
public class Solution6 {
    public int[] solution(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left += 1;
            right -= 1;
        }
        return arr;
    }
}
