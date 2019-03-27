package abcTest.mumberTest.collection;

import charactor.Hero;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 15:23 2019/3/27
 *@Modified By:
 */
public class CollectionTest1 {
    public static void main(String[] args) {
        List<Hero> hs =new ArrayList<>();
        System.out.println("初始化开始");
        for (int i = 0; i < 3000000; i++) {
            Hero h = new Hero(   "hero-" + random());
            hs.add(h);
        }
        //名字作为key
        //名字相同的hero，放在一个List中，作为value
        HashMap<String,List<Hero>> heroMap =new HashMap();
        for (Hero h : hs) {
            List<Hero> list= heroMap.get( h.getName());
            if(list==null){
                list = new ArrayList<>();
                heroMap.put(h.getName(), list);
            }
            list.add(h);
        }

        System.out.println("初始化结束");
        System.out.println("开始查找");
        findByIteration(hs);
        findByMap(heroMap);

    }
    private static List<Hero> findByMap(HashMap<String,List<Hero>> m) {
        long start =System.currentTimeMillis();
        List <Hero>result= m.get("hero-5555");
        long end =System.currentTimeMillis();
        System.out.printf("通过map查找，一共找到%d个英雄，耗时%d 毫秒%n",result.size(),end-start);
        return result;
    }
    private static List<Hero> findByIteration (List<Hero> hs) {
        long start =System.currentTimeMillis();
        List<Hero> result =new ArrayList<>();
        for (Hero h : hs) {
            if(h.getName().equals("hero-5555")){
                result.add(h);
            }
        }
        long end =System.currentTimeMillis();
        System.out.printf("通过for查找，一共找到%d个英雄，耗时%d 毫秒%n", result.size(),end-start);
        return result;
    }
    public static int random(){
        return ((int)(Math.random()*9000)+1000);
    }
}