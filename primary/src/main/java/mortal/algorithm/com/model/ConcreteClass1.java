package mortal.algorithm.com.model;

/**
 * @author mortal
 * @create 2021/9/16 11:17
 */
public class ConcreteClass1 extends AbstractClass{
    @Override
    protected void doSomeThing() {
        System.err.println("ConcreteClass1 doSomeThing");
    }
    @Override
    protected void doAnyThing() {
        System.err.println("ConcreteClass1 doAnyThing");
    }

}
