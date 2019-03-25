package charactor;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 16:15 2018/10/23
 *@Modified By:
 */
public class ADC extends Hero implements AD ,Mortal{
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }

    public void die(){
        System.out.println(name+"已被击杀");
    }

    public static void main(String[] args) {
        ADC Ashe=new ADC();
//        StringBuffer strb = new StringBuffer("ddd");

    }
}
