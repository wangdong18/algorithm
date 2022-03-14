package mortal.algorithm.com.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mortal
 * @create 2021/9/28 16:42
 */
public class Director {
    private ArrayList<String> sequenceList = new ArrayList<String>();

    private BenzBuilder benzBuilder = new BenzBuilder();
    private BmwBuilder bmwBuilder = new BmwBuilder();

    public BmwModel getABmwModel() {
        sequenceList.clear();
        sequenceList.add("start");
        bmwBuilder.setSequence(sequenceList);
        return (BmwModel) bmwBuilder.getCarModel();
    }

    public BmwModel getBBmwModel() {
        sequenceList.clear();
        sequenceList.add("alarm");
        sequenceList.add("engine boom");
        sequenceList.add("start");
        bmwBuilder.setSequence(sequenceList);
        return (BmwModel) bmwBuilder.getCarModel();
    }

    public BenzModel getCBenZModel() {
        sequenceList.clear();
        sequenceList.add("engine boom");
        sequenceList.add("start");
        benzBuilder.setSequence(sequenceList);
        return (BenzModel) benzBuilder.getCarModel();
    }

    public BenzModel getDBenZModel() {
        sequenceList.clear();
        sequenceList.add("alarm");
        sequenceList.add("start");
        benzBuilder.setSequence(sequenceList);
        return (BenzModel) benzBuilder.getCarModel();
    }
}
