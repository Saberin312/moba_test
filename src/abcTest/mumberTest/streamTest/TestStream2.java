package abcTest.mumberTest.streamTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 17:24 2018/11/20
 *@Modified By:
 */
public class TestStream2 {
    public static void main(String[] args) {
        int eachSize = 100 * 1024;//100k
        File srcFile = new File("f://download//lol.txt");
        splitFile(srcFile, eachSize);
    }

    /***
     * @Author:BHR
     * @Description:拆分思路，将源文件读取到内存中，再分配
     * @Date:2018/11/20 17:34
     */
    public static void splitFile(File srcFile, int eachSize) {
        if (0 == srcFile.length()) {
            throw new RuntimeException("文件长度为0不可分");
        }
        byte[] fileContent = new byte[(int) srcFile.length()];
        //读取到数组中
        try {
            FileInputStream fis = new FileInputStream(srcFile);
            fis.read(fileContent);
            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        //计算可分多少子文件
        int fileNumber;
        if (0 == fileContent.length % eachSize) {
            fileNumber = (int) (fileContent.length / eachSize);

        } else {
            fileNumber = (int) (fileContent.length / eachSize)+1;
        }
        for (int i = 0; i < fileNumber; i++) {
            String eachFielName = srcFile.getName() + "-" + i;
            File eachFile = new File(srcFile.getParent(), eachFielName);
            byte[] eachContent;

            if (i != fileNumber - 1) {
                eachContent = Arrays.copyOfRange(fileContent, eachSize * i, eachSize * (i + 1));
            } else {
                eachContent = Arrays.copyOfRange(fileContent, eachSize * i, fileContent.length);
            }
            try {
                FileOutputStream fos = new FileOutputStream(eachFile);
                fos.write(eachContent);
                fos.close();
                System.out.printf("输出文件%s,其大小是%d字节%n", eachFile.getAbsolutePath(), eachFile.length());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
