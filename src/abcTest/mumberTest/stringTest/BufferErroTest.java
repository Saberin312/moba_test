package abcTest.mumberTest.stringTest;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Date;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 19:32 2018/10/30
 *@Modified By:
 */
public class BufferErroTest {
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char)(ch1 +Math.random() * (ch2 - ch1 + 1)); //从两个字符中取随机数
    }

    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    public static void main(String[] args) {
        java.lang.StringBuffer jls = new java.lang.StringBuffer("DDDD");
        String st1 = "dddd";
        System.out.println(jls.length());
        System.out.println(jls.capacity());
        //获取进程前后的毫米数

        long stringStartTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            st1 = st1 + getRandomLowerCaseLetter();


        }
        long stringEndTime = System.currentTimeMillis();
        long stringTime = stringEndTime - stringStartTime;
        double timeDouble = Double.parseDouble(Long.toString(stringTime));

        System.out.println("String随机数组操作时间: " + timeDouble + "\nms");

        long stringBufferStartTime = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            jls.append(getRandomLowerCaseLetter());
        }
        long stringBufferEndTime = System.currentTimeMillis();
        long stringBufferTime = stringBufferEndTime - stringBufferStartTime;
        double strignDouble = Double.parseDouble(Long.toString(stringBufferTime));
        System.out.println("StringBuffer随机数组操作时间：" + strignDouble + "\tms");
    }
}
