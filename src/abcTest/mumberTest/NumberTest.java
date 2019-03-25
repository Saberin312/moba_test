package abcTest.mumberTest;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 12:39 2018/10/30
 *@Modified By:
 */
public class NumberTest {
    public static void main(String[] args) {
        int i=1;
        Integer ii=new Integer(i);  //基本类型转封装类型
        System.out.println(ii instanceof Number);
        int i2=ii.intValue();   //封装类型转基本类
        Integer ii2=i;  //  自动转换即装箱
        int i3=ii2;    //自动转换即拆箱
        // 获取int 最大值最小值
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);



    }
}
