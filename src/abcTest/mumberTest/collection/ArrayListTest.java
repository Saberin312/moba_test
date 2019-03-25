package abcTest.mumberTest.collection;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 12:45 2019/2/26
 *@Modified By:
 */

import java.util.ArrayList;
import java.util.List;
import charactor.Hero;

import javax.sound.midi.Soundbank;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList heros = new ArrayList();
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero" + i));
        }
        Hero specialHero = new Hero("specialHero");
        heros.add(specialHero);

        System.out.println(heros);
        //判断对象是否存在，标准：对象是否相同而非name是否一样
        System.out.println("name相同也可能返回false");
        System.out.println(heros.contains(new Hero("hero1")));
        System.out.println("判断special");
        System.out.println(heros.contains(specialHero));

        //get获取位置的位置,当心下标越界
        System.out.println(heros.get(5));
//        System.out.println(heros.get(6));

        //indexOf判断位置
        System.out.println("specialHeros所处的位置：" + heros.indexOf(specialHero));
        System.out.println("新的英雄，但名字是\"hero 1\"所处的位置：" + heros.indexOf(new Hero("hero 1")));

//        //remove删除
//        System.out.println(heros);
//        heros.remove(2);
//        System.out.println(heros);
//
    }


//    public static void main(String[] args) {
//        ArrayList heros = new ArrayList();
//
//        // 初始化5个对象
//        for (int i = 0; i < 5; i++) {
//            heros.add(new Hero("hero " + i));
//        }
//        Hero specialHero = new Hero("special hero");
//        heros.add(specialHero);
//
//        System.out.println(heros);
//        // 判断一个对象是否在容器中
//        // 判断标准： 是否是同一个对象，而不是name是否相同
////        System.out.print("虽然一个新的对象名字也叫 hero 1，但是contains的返回是:");
////        System.out.println(heros.contains(new Hero("hero 1")));
////        System.out.print("而对specialHero的判断，contains的返回是:");
////        System.out.println(heros.contains(specialHero));
//    }
}
