package mortal.algorithm.com.builder;

import java.util.ArrayList;

/**
 * @author mortal
 * @create 2021/9/28 11:38
 */
public class BmwBuilder extends CarBuilder{
    BmwModel bmwModel = new BmwModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmwModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmwModel;
    }
}
