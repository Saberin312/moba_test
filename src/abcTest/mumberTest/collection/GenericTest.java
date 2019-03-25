package abcTest.mumberTest.collection;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 14:10 2019/2/26
 *@Modified By:
 */

import java.util.Iterator;
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

        //聊胜于无的简写
        ArrayList<Hero> heroes = new ArrayList<>();
        heroes.add(new Hero("GALLEN"));
        heroes.add(new Hero("Timo"));
        heroes.add(new Hero("Timo1"));
        heroes.add(new Hero("Gallen1"));

        System.out.println();
        //遍历Arraylist
        for (int i = 0; i < heroes.size()-1; i++) {
            Hero hero = heroes.get(i);
            System.out.println(hero.getName());
//            System.out.println(heros.get(i));

        }
        //迭代器iterator
        System.out.println("使用while的iterator");
        Iterator<Hero> iterator = heroes.iterator();
        while (iterator.hasNext()) {
            Hero h2 = iterator.next();
            System.out.println(h);

        }
        System.out.println("for的interator");
        for (Iterator<Hero> iterator1=heroes.iterator(); iterator1.hasNext(); ) {
            Hero h3 = iterator1.next();
            System.out.println(h3.getName());
        }
        System.out.println("增强型for循环");
        for (Hero h3 : heroes) {
            System.out.println(h3.getName());
        }

        System.out.println(heroes.get(0));

        //泛型练习 可以放整数，浮点数，不可放字符串
        //利用数字类Number
//        ArrayList<Float> floatInteger = new ArrayList<>();
//        floatInteger.add(4.0);
        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(123);
        numbers.add(123f);
        numbers.add(123d);
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));

        //练习
        ArrayList<Number> numbers1 = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers1.add(i);
        }
        System.out.println("输入完毕");
        for (int j=0;j< numbers1.size();j++) {
//            System.out.println(j);
            if (numbers1.get(j).intValue()% 8 == 0) {
                System.out.println("删除" + numbers1.get(j));
                numbers1.remove(j);

            }

        }
        System.out.println("遍历完毕");


    }
}
