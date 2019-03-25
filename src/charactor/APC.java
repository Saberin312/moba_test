package charactor;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 16:24 2018/10/23
 *@Modified By:
 */
public class APC extends Hero implements AP {
    @Override
    public void magicAttack(){
        System.out.println("进行了物理攻击");
    }

    public void die(){
        System.out.println(name+"已经被击杀");
    }
}
