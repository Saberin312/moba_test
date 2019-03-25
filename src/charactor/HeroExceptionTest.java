package charactor;

import exception.EnemyHeroIsDeadException;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 16:00 2018/10/31
 *@Modified By:
 */
public class HeroExceptionTest {
    public static void main(String[] args) {
        Hero Gallen = new Hero();
        Gallen.name = "Gallen";
        Hero Teemo = new Hero();
        Teemo.name = "Teemo";
        Teemo.hp = 0;
        try {
            Gallen.attackHero(Teemo);
        } catch (EnemyHeroIsDeadException e) {
            System.out.println("异常的具体原因：\t" + e.getMessage());
            e.printStackTrace();
        }
    }
}
