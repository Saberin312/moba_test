package abcTest.mumberTest.collection;

import charactor.Hero;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 13:55 2019/3/27
 *@Modified By:
 */
public class HashMapTest {

    public static void main(String[] args) {
//        HashMap<String, String> hashMap = new HashMap<>();
//        hashMap.put("adc", "物理英雄");
//        hashMap.put("adc", "魔法英雄");
//        hashMap.put("tank", "坦克");
//        System.out.println(hashMap.get("tank"));
        //对比ArrayList 与HashMap的查找性能
//        List<Hero> heroArrayList = new ArrayList<>();
//        for (int i=0;i<10000;i++) {
////            heroArrayList.add(new Hero("Gallen" +(int)(Math.random()*1000)));
////            heroArrayList.get(i) = new Hero();
////            hero.setName("Gallen" + Math.random( /) * 1000);
////            Hero hero = new Hero("Gallen" +(int)(Math.random()*1000));
//            Hero hero = new Hero("Gallen" +
//            random());
//            heroArrayList.add(hero);
//            System.out.println(heroArrayList.get(i).getName());
//            //相同name的hero存为一个list 存入hashmap
//
//        }
////        HashMap<String, List<Hero>> heroMap = new HashMap<>();
////        for (Hero h : heroArrayList) {
////            List<Hero> list = heroMap.get(h.getName());
////            if (list == null) {
////                list = new ArrayList<>();
////                heroMap.put(h.getName(), list);
////            }
////            list.add(h);
////        }
//        HashMap<String,List<Hero>> heroMap =new HashMap();
//        for (Hero h : heroArrayList) {
//            List<Hero> list= heroMap.get( h.getName());
//            if(list==null){
//                list = new ArrayList<>();
//                heroMap.put(h.getName(), list);
//            }
//            list.add(h);
//        }
        List<Hero> hs =new ArrayList<>();
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
        List <Hero>result= m.get("hero5555");
        if (result == null) {
            result = new ArrayList<>();
        }
        long end =System.currentTimeMillis();
        System.out.printf("通过map查找，一共找到%d个英雄，耗时%d 毫秒%n",result.size(),end-start);
        return result;
    }
    private static List<Hero> findByIteration (List<Hero> hs) {
        long start =System.currentTimeMillis();
        List<Hero> result =new ArrayList<>();
        for (Hero h : hs) {
            if(h.getName().equals("hero5555")){
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
