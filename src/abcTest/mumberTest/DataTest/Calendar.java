package abcTest.mumberTest.DataTest;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.text.SimpleDateFormat;
import java.util.Date;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 14:06 2018/10/31
 *@Modified By:
 */
public class Calendar {

    //    public static void main(String[] args) {
//        java.util.Calendar c = java.util.Calendar.getInstance();
//        Date d = c.getTime();
//        Date d2 = new Date(0);
//        c.setTime(d2);
//        //翻日历
//
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private static String format(Date time) {
        return sdf.format(time);
    }
    public static void main(String[] args) {
        java.util.Calendar c = java.util.Calendar.getInstance();
        Date now = c.getTime();
        //当前日期
        System.out.println("当前日期： \t" + format(c.getTime()));
        //下个月的今天
        c.setTime(now);
        c.add(java.util.Calendar.MONTH, 1);
        System.out.println("下个月的今天：\t" + format(c.getTime()));
        //上个月的今天
        c.setTime(now);
        c.add(java.util.Calendar.MONTH, -1);
        System.out.println("上个月的今天：\t" + format(c.getTime()));
    }

    }

