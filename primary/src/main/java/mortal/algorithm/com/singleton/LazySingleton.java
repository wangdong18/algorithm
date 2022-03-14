package mortal.algorithm.com.singleton;


import static java.lang.Thread.sleep;

/**
 * MySingleton 我自己写的
 * 懒汉式
 * 特点：
 * 线程不安全，运行时加载，对性能有损耗
 *
 * @author mortal
 * @create 2021/9/8 13:55
 */
public class LazySingleton {
    private static LazySingleton singleton = null;

    private LazySingleton() {
    }

    /**
     * 不加锁就是非线程安全的
     *
     * @return
     */
    public static LazySingleton getInstance() {
        if (null == singleton) {
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            singleton = new LazySingleton();
        }
        return singleton;
    }

    /**
     * 此时加上锁就是线程安全的
     * 不加锁就是非线程安全的
     *
     * @return
     */
    public static synchronized LazySingleton getInstanceSynchronized() {
        if (null == singleton) {
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            singleton = new LazySingleton();
        }
        return singleton;
    }

    public String say() {
        return singleton.toString();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Thread() {
                @Override
                public void run() {
                    LazySingleton instance = LazySingleton.getInstanceSynchronized();
                    System.err.println(instance.say());
                }
            }.start();
        }
    }
}
