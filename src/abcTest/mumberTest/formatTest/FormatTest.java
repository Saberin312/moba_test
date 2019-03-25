package abcTest.mumberTest.formatTest;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 14:51 2018/10/30
 *@Modified By:
 */
public class FormatTest {
    public static void main(String[] args) {
        String name="Gallen";
        String title="Legendary!";
        int kill=8;
        System.out.println(name+title); //println输出
        //format输出
        String sentenceFormat="%s进行了%d次击杀之后，获得了%s的称号%n";
        System.out.println(sentenceFormat+name+kill+title);
        System.out.format(sentenceFormat,name,kill,title);
        System.out.format("这就是换行符%n     s");

    }
}
