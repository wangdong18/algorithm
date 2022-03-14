package mortal.algorithm.com.singleton;


/**
 * 线程安全的懒汉式
 * @author mortal
 * @create 2021/9/8 14:40
 */
public class SafeLazySingleton {
    /**
     * 为什么此时 volatile
     *  因为java初始化时有可能会进行指令重排
     *     指令重排：
     *  一般而言初始化操作并不是一个原子操作，而是分为三步：
     *
     *  在堆中开辟对象所需空间，分配地址
     *  根据类加载的初始化顺序进行初始化
     *  将内存地址返回给栈中的引用变量
     *  由于 Java 内存模型允许“无序写入”，有些编译器因为性能原因，可能会把上述步骤中的 2 和 3 进行重排序，顺序就成了
     *
     *  在堆中开辟对象所需空间，分配地址
     *  将内存地址返回给栈中的引用变量（此时变量已不在为null，但是变量却并没有初始化完成）
     *  根据类加载的初始化顺序进行初始化
     *
     *
     */
    private static volatile SafeLazySingleton singleton = null;

    private  SafeLazySingleton(){

    }

    /**
     * 线程安全的问题，两个线程抢占
     * @return
     */
    private  static  SafeLazySingleton getInstance(){
        //重排指令导致在此时可能不为空了，所以加上对象上volatile
        if(null==singleton){
            synchronized (SafeLazySingleton.class){
                if(null==singleton){
                    singleton = new SafeLazySingleton();
                }
            }
        }
        return singleton;
    }

    public String say() {
        return singleton.toString();
    }

    public static void main(String[] args) {
        for (int i = 0; i <1000 ; i++) {
            new Thread(){
                @Override
                public void run() {
                    SafeLazySingleton instance = SafeLazySingleton.getInstance();
                    System.err.println(instance.say());
                }
            }.start();
        }
    }
}
