package exception;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 14:35 2018/10/31
 *@Modified By:
 */

import com.sun.media.sound.SoftTuning;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class ExceptionTest1 {
    public static void main(String[] args) {
        File f = new File("e:/Mobea.exe");
        try {
            System.out.println("试图打开e:/Mobea.exe");
            new FileInputStream(f);
            System.out.println("成功打开");
        }
//        //子类
//        catch (FileNotFoundException E) {
//            System.out.println("e:/Mdoea.exe不存在");
//            E.printStackTrace();
//        }
        //使用父类catch
        catch (Exception e) {
            System.out.println("e:/Modoea.exe不存在");
            e.printStackTrace();
        }
    }

}
