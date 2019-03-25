package charactor;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 16:07 2018/10/23
 *@Modified By:
 */
public class Dragon {
    private static Dragon ourInstance = new Dragon();

    public static Dragon getInstance() {
        return ourInstance;
    }

    private Dragon() {
    }
}
