package charactor;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 10:19 2018/10/23
 *@Modified By:
 */
public class ADHero extends Hero implements AD{
    public void attack(){
        System.out.println(name+"进行了一次攻击，目标未知");
    }
    /*
    public void attack(Hero h1){
        System.out.println(name+"对"+h1.name+"进行了一次普通攻击");
    }
    public void attack(Hero h1,Hero h2){
        System.out.println(name+"对"+h1.name+"和"+h2.name+"同时进行了一次攻击");
    }
    */
    //可变数量的参数
    public static void Ace(){
        System.out.println("adcACE！！！！！！");
    }
    @Override
    public void physicAttack(){
        System.out.println("进行了物理攻击！" );
    }
    public void  attack(Hero...heros){
        for(int i=0;i<heros.length;i++){
            System.out.println(name+"攻击了"+heros[i].name);
        }
    }

    public static void main(String[] args) {
        ADHero Ashe=new ADHero();
        Ashe.name="艾希";
        Hero h1=new Hero();
        h1.name="盖伦";
        Hero h2=new Hero();
        h2.name="提莫";
        Ashe.attack();
        Ashe.attack(h1);
        Ashe.attack(h1,h2);

        Ashe.Ace();
        Hero.Ace();

        Hero h3=new ADHero();
        h3.Ace();
        System.out.println(h3.toString());
    }
}
