package mortal.algorithm.com.model;

/**
 * @author mortal
 * @create 2021/9/16 11:28
 */
public class HummerClient {
    public static void main(String[] args) {
        HummerModel model = new HummerH1Model();
        model.run();
        HummerModel model2 = new HummerH2Model();
        model2.run();

        System.err.println("-----");
        //停车
        model.stop();
        model2.stop();

    }
}
