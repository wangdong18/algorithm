package mortal.algorithm.com.singleton;

/**
 * 静态内部类 参考饿汉模式
 * 特点：线程安全，调用效率较高，能延迟加载
 *
 * @author mortal
 * @create 2021/9/8 13:55
 */
public class EarlySingletonChange {

    private EarlySingletonChange() {
    }

    static class EarlySingletonChangeInstance {
        private static EarlySingletonChange singleton = new EarlySingletonChange();
    }

    public static EarlySingletonChange getInstance() {
        return EarlySingletonChangeInstance.singleton;
    }

    public String say() {
        return EarlySingletonChangeInstance.singleton.toString();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Thread() {
                @Override
                public void run() {
                    EarlySingletonChange instance = EarlySingletonChange.getInstance();
                    System.err.println(instance.say());
                }
            }.start();
        }
    }

}
