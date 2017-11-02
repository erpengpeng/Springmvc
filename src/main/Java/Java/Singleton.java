package Java;

/**
懒汉式单例类.在第一次调用的时候实例化自己
*/
public class Singleton {
    private Singleton() {
    }
    private static  Singleton singleton =null;

    // 静态工厂方法
    public static  Singleton getSingleton() {
         if(singleton==null){
             singleton =new Singleton();
         }
         return singleton;
    }

}





