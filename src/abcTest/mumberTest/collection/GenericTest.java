package abcTest.mumberTest.collection;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 14:10 2019/2/26
 *@Modified By:
 */

import java.util.List;
import java.util.ArrayList;

import charactor.APC;
import porperty.Item;
import charactor.Hero;
import charactor.APC;

public class GenericTest {
    public static void main(String[] args) {
        //不用泛型的容器可以放英雄也可以放物品
        List heros = new ArrayList();
        heros.add(new Hero("Gallen"));
        //本来存放英雄的容器也可以存放物品
        heros.add(new Item("冰杖"));
        //对象转型会出现问题
        Hero h1 = (Hero) heros.get(0);
        //对象数量过多时会出问题
//        Hero h2 = (Hero) heros.get(1);

        //引入泛型Generic
        //声明容器的时候指定该容器只能放Hero
        List<Hero> genericheros = new ArrayList<Hero>();
        genericheros.add(new Hero("Galllen"));
//        genericheros.add(new Item("冰杖"));
        //此外可以放子类
        genericheros.add(new APC());

        //取出数据时不需要进行转型了
        Hero h = genericheros.get(0);
    }
}
