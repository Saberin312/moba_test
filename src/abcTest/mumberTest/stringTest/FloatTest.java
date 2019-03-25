package abcTest.mumberTest.stringTest;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 13:23 2018/10/30
 *@Modified By:
 */
public class FloatTest {
    public static void main(String[] args) {
        float f1=3.14f;
        String str1=Float.toString(f1);
        String str2="3.1a4";
        float f2= Float.parseFloat(str2);
        System.out.println(f2);


    }
}
