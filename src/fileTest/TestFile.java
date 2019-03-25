package fileTest;

import java.io.File;
import java.util.Date;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 12:57 2018/11/9
 *@Modified By:
 */
public class TestFile {
    public static void main(String[] args) {
        //绝对路径建立file
        File fl = new File("G://WeGame//英雄联盟");
        System.out.println("fl的绝对路径：" + fl.getAbsolutePath());

        //相对路径
        File f2 = new File("TestFile.java");
        System.out.println("f2的绝对路径：" + f2.getAbsolutePath());

        //将f1作为父目录，通过相对位置添加
        File f3 = new File(fl, "英雄联盟卸载。exe");
        System.out.println("f3的绝对路径：" + f3.getAbsolutePath());

        //文件判断
        System.out.println("当前文件or文件夹是：" + fl);
        System.out.println("判断是否存在：" + f2.exists());
        System.out.println("判断是否是文件夹：" + f2.isDirectory());
        System.out.println("判断是否是文件：" + f2.isFile());

        //信息获取
        System.out.println("获取文件长度：" + f2.length());
        long time = f2.lastModified();
        Date d = new Date(time);
        System.out.println("time:"+time);
        System.out.println("获取文件最后的修改时间："+d+"\n"+time);
//        f2.setLastModified(0);
        System.out.println("重置后的修改时间："+d);

    }
}
