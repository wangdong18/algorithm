package mortal.algorithm.com.singleton;

/**
 * 在effective java中说道，最佳的单例实现模式就是枚举模式
 * @author mortal
 * @create 2021/9/10 15:53
 */
public enum SingletonEnum {
    INSTANCE;

    private  void someThing(){
        System.err.println("do it now!");
    }

    public static void main(String[] args) {
        SingletonEnum.INSTANCE.someThing();
    }
}
