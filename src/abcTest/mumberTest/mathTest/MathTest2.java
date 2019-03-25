package abcTest.mumberTest.mathTest;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 13:38 2018/10/30
 *@Modified By:
 */
public class MathTest2 {
    //计算自然常数


    public static void main(String[] args) {
         double N = 1000.00;
/*
        for (int i = 1; i <=N; i++) {
            float f1=1/i
            System.out.println(i);
        }
        */
    double f2=1+1/N;
    System.out.println("f2="+f2);
    double f3=Math.pow(f2,N);
    String se=Double.toString(f3);
    System .out.println("个人计算自然常数E="+f3);
    System .out.println("实际自然常熟="+Math.E);
    }
}
