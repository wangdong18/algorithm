package mortal.algorithm.com.builder;

import java.util.ArrayList;

/**
 * @author mortal
 * @create 2021/9/28 11:41
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        for (int i = 0; i < 10; i++) {
            BmwModel aBmwModel = director.getBBmwModel();
            aBmwModel.run();
        }

        for (int i = 0; i < 10; i++) {
            BenzModel cBenZModel = director.getCBenZModel();
            cBenZModel.run();
        }

    }
}
