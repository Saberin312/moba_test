package charactor;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 12:23 2018/10/23
 *@Modified By:
 */
public class Support extends Hero implements Healer {

//    @Override
//    public void heal(int Amount,Hero...heroes){
//        for(int i=0;i<heroes.length;i++){
//            heroes[i].hp=heroes[i].hp+Amount;
//            System.out.println(name+"为"+heroes[i].name+"回血"+Amount);
//        }
//
//    }

    @Override
    public void heal(int Amount,Hero...heroes) {
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].hp = heroes[i].hp + Amount;
            System.out.println(name + "为" + heroes[i].name + "回血" + Amount);
        }
    }


    public static void main(String[] args) {
        Support Taric=new Support();
        Taric.name="塔里克";
        Hero h1=new Hero();
        h1.name="艾克";
        h1.hp=350;
        Taric.heal(100,h1);
    }
}
