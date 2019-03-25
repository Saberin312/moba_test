package fileTest;

import java.io.File;
/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 16:24 2018/11/9
 *@Modified By:
 */
public class Traversing_Test {
    public static void main(String[] args) {
        File f = new File("c://windows");
        File[] fs = f.listFiles();
        if (null == fs) {
            return;
        }
        long minSize = Integer.MAX_VALUE;
        long maxSize = 0;
        File minFile = null;
        File maxFile = null;
        for (File file : fs) {
            if (file.isDirectory()) {
                System.out.println("文件夹：" + file.getAbsolutePath());
                continue;   //跳出循环，略过文件夹
            }
            if (file.length() > maxSize) {
                maxSize = file.length();
                maxFile = file;
            }
            if (file.length() != 0 && file.length() < minSize) {
                minSize = file.lastModified();
                minFile = file;
            }
        }
        System.out.printf("最大的文件是%s，其大小是%d字节%n",maxFile.getAbsolutePath(), maxFile.length());
        System.out.printf("最小的文件是%s，其大小是%d字节%n", minFile.getAbsolutePath(), minFile.length());

    }
}
