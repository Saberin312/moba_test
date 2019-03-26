package abcTest.mumberTest.collection;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 12:01 2019/2/26
 *@Modified By:
 */

import charactor.Hero;

import java.util.ArrayList;
import java.util.LinkedList;
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

        //ArrayList 对比 LinkedListTest
        //插入数据
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
//        int total = 1000 * 1000;
        long start = System.currentTimeMillis();
        for (int i = 0; i <10; i++) {
//            arrayList.add(i);
            arrayList.add(i, 5);
            System.out.println(arrayList.get(0));
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        long start1 = System.currentTimeMillis();
        for (int j = 0; j < total; j++) {
//            linkedList.addFirst(j);
            linkedList.add(j, 5);
        }
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);

        insertFirst(arrayList, "ArrayList");
        insertFirst(linkedList, "LinkedList");






    }
    final static int total = 1000 * 100;
    private static void insertFirst(List<Integer> l, String type) {
//            int total = 1000 * 100;
        final int number = 5;
        long start = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            l.add(0, number);
        }
        long end = System.currentTimeMillis();
        System.out.printf("在%s 最前面插入%d条数据，总共耗时 %d 毫秒 %n", type, total, end - start);
    }
}
