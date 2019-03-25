package charactor;

/***
 *@Author:BHR
 *@Description:enum遍历dispaly
 *@Date:Created in 15:40 2018/10/23
 *@Modified By:
 */
public class Display {
    public static void main(String[] args) {
        heroType herotype=heroType.Assit;
        switch (herotype){
            case Push:
                System.out.println("推进");
                break;
            case Tank:
                System.out.println("坦克");
                break;
            case Assit:
                System.out.println("辅助");
                break;
            case Randed:
                System.out.println("远程");
                break;
            case Wizard:
                System.out.println("法师");
                break;
            case Assasin:
                System.out.println("此刻");
                break;
            case Farming:
                System.out.println("打野");
                break;
            case Warrior:
                System.out.println("站士");
                break;



        }
        //遍历
        for(heroType ht:heroType.values()){
            System.out.println(ht);
        }
    }
}
