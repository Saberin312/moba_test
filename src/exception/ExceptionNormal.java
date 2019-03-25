package exception;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 15:22 2018/10/31
 *@Modified By:
 */
public class ExceptionNormal {
    public static void main(String[] args) {
        //ArithmeticException
        int k=1/0;
        //ArrayIndexOutOfBoundsException
        int j[] = new int[5];
        j[10]=10;
        //NullPointerException
        String str=null;
        str.length();
    }
}
