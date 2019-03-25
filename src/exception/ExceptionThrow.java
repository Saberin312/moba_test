package exception;

import java.io.File;
import java.io.FileInputStream;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 15:14 2018/10/31
 *@Modified By:
 */
public class ExceptionThrow {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        try {
            method2();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void method2() throws Exception{
        File f = new File("d:/lol.exe");

        System.out.println("试图打开d:/lol.exe");
        new FileInputStream(f);
        System.out.println("打开成功");

    }
}
