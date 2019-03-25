package abcTest.mumberTest.DataTest;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 13:11 2018/10/31
 *@Modified By:
 */

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DataTest1 {
    public static void main(String[] args) {

        Date d1 = new Date();
        System.out.println("当前时间：\t" + d1);
        System.out.println("从1970年1月1日08：00：00起经过了5s的时间");
        Date d2 = new Date(5000);
        System.out.println(d2);
        //getTime()即具体毫秒数
        System.out.println(d2.getTime() + "ms");
        //日期格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String sTime = sdf.format(d1);
        System.out.println("格式化后当前时间：\t" + sTime);
        System.out.println("格式化前默认格式\t" + d1);
        //异常测试
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sTime2 = "2018-02-02 13:44:22";
        try {
            Date d = sdf2.parse(sTime2);
            System.out.format("字符串%s通过格式 yyyy:MM:dd HH:mm:ss \n转换为日期对象：%s", sTime2, d.toString());
        } catch (ParseException e) {
            //TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
