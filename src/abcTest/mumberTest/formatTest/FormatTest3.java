package abcTest.mumberTest.formatTest;

import java.util.Scanner;
import java.util.SplittableRandom;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 15:36 2018/10/30
 *@Modified By:
 */
public class FormatTest3 {
    public static void main(String[] args) {
        String sentenceHH = "%s最大%s倒闭了，王八蛋老板%s吃喝嫖赌，欠下了%d个亿，" +
                "带着他的小姨子跑了！我们没有办法，拿着%s抵工资！";
        System.out.println("location=");
        Scanner s = new Scanner(System.in);
        String location = s.nextLine();

        System.out.println("company=");
        Scanner c = new Scanner(System.in);
        String company=c.nextLine();

        System.out.println("boos=");
        Scanner b = new Scanner(System.in);
        String boss = b.nextLine();

        System.out.println("debts=");
        Scanner d = new Scanner(System.in);
        int debts = d.nextInt();

        System.out.println("commodity");
        Scanner co = new Scanner(System.in);
        String commodity=co.nextLine();

        System.out.format(sentenceHH, location, company, boss, debts, commodity);
        System.out.println(sentenceHH.indexOf("跑了"));
    }
}
