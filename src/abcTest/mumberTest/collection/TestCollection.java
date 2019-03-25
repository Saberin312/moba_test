package abcTest.mumberTest.collection;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 12:01 2019/2/26
 *@Modified By:
 */

import charactor.Hero;

import java.util.ArrayList;
import java.util.List;
public class TestCollection {
    public static void main(String[] args) {
//        //数组的局限性
//        Hero hero[] = new Hero[10];
//        //声明长度为10的数组，不用浪费，过10又放不下
//        hero[0] = new Hero("Gallen");
//        //放不下要报错
//        hero[20] = new Hero("Timo");

//使用容器ArrayList可避免此问题
        //容器ArrayList用于存放对象
        //Arraylist实现了List接口
        ArrayList heros = new ArrayList();
        heros.add(new Hero("Gallen"));
        System.out.println(heros.size());

        //容器的Capacity会自动增加不会出现边界问题
        heros.add(new Hero("Timo"));
        System.out.println(heros.size());


    }
}
