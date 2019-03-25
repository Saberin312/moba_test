package abcTest.mumberTest.stringTest;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 13:11 2018/10/30
 *@Modified By:
 */
public class StringTest {
    public static void main(String[] args) {
        int i = 5;
        String s1 = String.valueOf(i);
        System.out.println(i);
        Integer in = i;   ///调用Integer静态方法
        String s2 = in.toString();
        int i2 = Integer.parseInt(s1);
    }
}
