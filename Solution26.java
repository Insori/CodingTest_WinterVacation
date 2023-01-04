// 구름에듀 COS PRO 2급 3차시
// 5. 여행객의 총 교통비 구하기
public class Solution26 {
    public int solution(int[] memberAge, String transportation) {
        int adultExpense = 0;
        int childExpense = 0;

        if(transportation.equals("Bus")) {
            adultExpense = 40000;
            childExpense = 15000;
        }
        else if(transportation.equals("Ship")) {
            adultExpense = 30000;
            childExpense = 13000;
        }
        else if(transportation.equals("Airplane")) {
            adultExpense = 70000;
            childExpense = 45000;
        }

        if(memberAge.length >= 10) {
            adultExpense -= (adultExpense * 0.1);
            childExpense -= (childExpense * 0.2);
        }

        int totalExpenses = 0;
        for(int i = 0; i < memberAge.length; i++) {
            if(memberAge[i] >= 20)
                totalExpenses += adultExpense;
            else
                totalExpenses += childExpense;
        }

        return totalExpenses;
    }
}
