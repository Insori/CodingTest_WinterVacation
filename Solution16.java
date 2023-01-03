// 구름에듀 COS PRO 2급 2차시
// 5. 몬스터 공격하기
public class Solution16 {
    public int solution(int attack, int recovery, int hp) {
        int count = 0;
        while(true){
            count += 1;
            hp -= attack;
            if(hp <= 0)
                break;
            hp += recovery;
        }
        return count;
    }
}
