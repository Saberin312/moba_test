package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 15:01 2018/10/31
 *@Modified By:
 */
public class ExceptionMulti {
    public static void main(String[] args) {
        File f = new File("D:/Doda.exe");
        try {
            System.out.println("试图打开D:/Dota.exe");
            new FileInputStream(f);
            System.out.println("成功打开");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse("2018-1-1");
        } catch (FileNotFoundException e) {
            System.out.println("D:/Dota.exe不存在");
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("日期解析格式错误");
            e.printStackTrace();
        }
        finally {
            System.out.println("无论是否catch异常都会执行");

        }
    }
}
