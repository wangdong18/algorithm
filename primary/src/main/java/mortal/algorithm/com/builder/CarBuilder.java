package mortal.algorithm.com.builder;

import java.util.ArrayList;

/**
 * @author mortal
 * @create 2021/9/27 11:35
 */
public  abstract class CarBuilder {
    
    public abstract void setSequence(ArrayList<String> sequence);

    public abstract CarModel getCarModel();
}
