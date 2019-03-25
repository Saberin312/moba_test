package charactor;

/***
 *@Author:BHR
 *@Description:SingleTon单例方法的实现。1，私有化构造昂发；2，静态属性指向实例；3，getInstance
 *@Date:Created in 15:09 2018/10/23
 *@Modified By:
 */
public class Baron {
////    饿汉式方法
//    private Baron(){
//    }
//    private static Baron instance =new Baron();
//    public static Baron getInstance(){
//        return instance;
//    }

    //懒汉式方法实现单例
    private Baron(){
    }
    private static Baron instance;
    public static Baron getInstance(){
        instance=new Baron();
        return instance;
    }
}
