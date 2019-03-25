package abcTest.mumberTest.mathTest;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 13:31 2018/10/30
 *@Modified By:
 */
public class MathTest {
    //java提供了许多Math数据静态方法
    public static void main(String[] args) {
        float f1=3.14f;
        float f2=3.24f;
        System.out.println(Math.round(f1));
        System.out.println(Math.random());
        System.out.println((int)Math.random()*10);
        System.out.println(Math.sqrt(f1));
        System.out.println(Math.pow(f2,2));
        //自然常数E与圆周率PI

    }
}
