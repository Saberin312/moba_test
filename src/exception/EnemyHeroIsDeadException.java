package exception;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 15:39 2018/10/31
 *@Modified By:
 */
public class EnemyHeroIsDeadException extends Exception{
    public EnemyHeroIsDeadException() {

    }

    public EnemyHeroIsDeadException(String msg) {
        super(msg);
    }
}
