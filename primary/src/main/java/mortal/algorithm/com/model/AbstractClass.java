package mortal.algorithm.com.model;

/**
 * 模板方法模式
 * @author mortal
 * @create 2021/9/16 11:11
 */
public abstract class AbstractClass {
    /**
     * 基本方法
     * 基本操作，是由子类实现的方法，并且在模板方法被调用。
     */
    protected abstract void doSomeThing();
    protected abstract void doAnyThing();

    /**
     * 模板方法
     * 可以有一个或几个，一般是一个具体方法，也就是一个框架，实现对基本方法的调度，完成固定的逻辑。
     */
    public void templateMethod(){
        doAnyThing();
        doSomeThing();
    }
}
