package fileTest;

import java.io.File;
import java.io.IOException;
/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 13:30 2018/11/9
 *@Modified By:
 */
public class TestFile2 {
    public static void main(String[] args) throws IOException {
        File f = new File("G://WeGame/英雄联盟");
        //字符串形式返回所有文件
        f.list();
        System.out.println("字符串返回所有文件：" + f.list());
        //字符数组形式返回所有文件
        File[] fs = f.listFiles();
        //字符串形式返回所在文件夹
        f.getParent();

        //创建文件夹
        f.mkdir();//父文件夹skin不存在则无效
        f.mkdirs();//父文件夹skin不存在则创建父文件夹
        //创建空文件
        f.createNewFile();//创建空文件，父文件夹不在则抛出异常
        //故创建空文件之前，通常会创建父目录
        f.getParentFile().mkdirs();
        //列出所有盘cde
        f.listRoots();

        f.delete();
        f.deleteOnExit();//退出时删除，用于临时文件的删除
    }

}
