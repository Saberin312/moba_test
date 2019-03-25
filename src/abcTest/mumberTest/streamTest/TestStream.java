package abcTest.mumberTest.streamTest;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 16:42 2018/11/20
 *@Modified By:
 */
public class TestStream {
    public static void main(String[] args) {
        try {
            File f = new File("F:/download/lol.txt");
            FileInputStream fis = new FileInputStream(f);
            byte[] all = new byte[(int) f.length()];
            fis.read(all);
            for (byte b : all) {
                System.out.println(b); //输出ASCⅡ码
            }
            fis.close();

            byte data[] = {88, 89};
            FileOutputStream fos = new FileOutputStream(f);
            fos.write(data);
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
