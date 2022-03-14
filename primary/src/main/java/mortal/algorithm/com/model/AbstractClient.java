package mortal.algorithm.com.model;

/**
 * @author mortal
 * @create 2021/9/16 11:19
 */
public class AbstractClient {
    public static void main(String[] args) {
        AbstractClass abstractClass = new ConcreteClass1();
        abstractClass.templateMethod();

        AbstractClass abstractClass2 = new ConcreteClass2();
        abstractClass2.templateMethod();

    }
}
