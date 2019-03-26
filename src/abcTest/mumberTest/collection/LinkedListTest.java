package abcTest.mumberTest.collection;

import charactor.Hero;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 11:00 2019/3/26
 *@Modified By:
 */
public class LinkedListTest {
    public static void main(String[] args) {
        //  LinkedListTest 是一个双向链表结构的list
        java.util.LinkedList<Hero> heroLinkedList = new java.util.LinkedList<>();
        heroLinkedList.add(new Hero("Gallen"));
        heroLinkedList.add(new Hero("Timo"));
        System.out.println(heroLinkedList);

        heroLinkedList.addFirst(new Hero("Kalye"));
        System.out.println(heroLinkedList);
        System.out.println(heroLinkedList.getFirst());
        //FIFO
        System.out.println("第一个元素：" + heroLinkedList.peek());
        heroLinkedList.offer(new Hero("Lee_Sin"));
        System.out.println(heroLinkedList);
        heroLinkedList.poll();
        System.out.println(heroLinkedList);
    }
}
