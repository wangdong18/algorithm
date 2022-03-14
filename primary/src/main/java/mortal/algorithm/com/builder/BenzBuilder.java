package mortal.algorithm.com.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mortal
 * @create 2021/9/28 10:52
 */
public class BenzBuilder extends CarBuilder {

    private BenzModel benzModel = new BenzModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benzModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benzModel;
    }
}
