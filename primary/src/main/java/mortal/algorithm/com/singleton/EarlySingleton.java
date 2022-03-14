package mortal.algorithm.com.singleton;

/**
 * 饿汉模式
 * 特点：线程安全，调用效率较高，但是不能延迟加载
 * @author mortal
 * @create 2021/9/8 13:55
 */
public class EarlySingleton {

    private static EarlySingleton singleton = new EarlySingleton();

    private EarlySingleton() {

    }

    public static EarlySingleton getInstance(){
        return singleton;
    }

    public String say(){
        return singleton.toString();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Thread(){
                @Override
                public void run() {
                    EarlySingleton instance = EarlySingleton.getInstance();
                    System.err.println(instance.say());
                }
            }.start();
        }
    }

}
