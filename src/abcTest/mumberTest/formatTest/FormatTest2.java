package abcTest.mumberTest.formatTest;

import java.util.Locale;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 15:05 2018/10/30
 *@Modified By:
 */
public class FormatTest2 {
    public static void main(String[] args) {
        int year=2020;
        System.out.println(year);
        System.out.format("%d%n",year);
        System.out.format("%8d%n",year);
        System.out.format("%-8d%n", year);
        System.out.format("%08d%n", year);
        System.out.format("%,8d%n", year*10000);
        System.out.format("%.2f%n", Math.PI);
        //不同国家的数字分割符
        System.out.format(Locale.CANADA, "%,2f%n", Math.PI);
        System.out.format(Locale.FRANCE, "%,2f%n", Math.PI);


    }
}
