package porperty;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 18:02 2018/10/22
 *@Modified By:
 */
public class Item {
    String name;
    int price;

    public Item() {

    }

    //提供一个初始化name的构造方法
    public Item(String name) {
        this.name = name;
    }
    public void effect(){
        System.out.println("使用之后，会有效果");
    }
    public static void main(String[] args){
        Item healthPotion=new Item();
        healthPotion.name="血瓶";
        healthPotion.price=50;

        Item manaPotion=new Item();
        manaPotion.name =  "草鞋";
        manaPotion.price= 300;

    }
}
