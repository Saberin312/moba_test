package porperty;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 10:06 2018/10/23
 *@Modified By:
 */
public class Weapon extends Item {
    int damage; //攻击力

    public static void main(String[] args) {
        Weapon infinityEdge= new Weapon();
        infinityEdge.damage=65;
        infinityEdge.name="无尽之刃";
        infinityEdge.price=3600;
    }
}
