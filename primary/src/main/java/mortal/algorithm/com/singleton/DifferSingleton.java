package mortal.algorithm.com.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 创建不同的单例
 * 在使用时指定
 * @author mortal
 * @create 2021/9/10 16:02
 */
public class DifferSingleton {
    static int maxSingletonCount = 3;
    static int rightSingletonCount=0;
    static List<String> nameList = new ArrayList<String>();
    static List<DifferSingleton> differSingletonList = new ArrayList<DifferSingleton>();
    static {
        for (int i = 0; i < maxSingletonCount; i++) {
            differSingletonList.add(new DifferSingleton("第" + (i + 1) + "个单例对象"));
        }
    }

    private DifferSingleton() {

    }

    private DifferSingleton(String name) {
        nameList.add(name);
    }

    private static DifferSingleton  getInstance() {
        Random random = new Random();
        int i = random.nextInt(maxSingletonCount);
        rightSingletonCount = i;
        return differSingletonList.get(i);
    }

    private String say(){
       return nameList.get(rightSingletonCount);
    }

    public static void main(String[] args) {
        for (int i = 0; i <1000 ; i++) {
            new Thread(){
                @Override
                public void run() {
                    DifferSingleton instance = DifferSingleton.getInstance();
                    System.err.println(instance.say()+instance.toString());
                }
            }.start();
        }
    }
}
