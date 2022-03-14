package mortal.algorithm.com.builder;

/**
 * @author mortal
 * @create 2021/9/27 11:44
 */
public class BmwModel extends CarModel {
    @Override
    protected void start() {
        System.err.println("宝马车启动是这样的");
    }

    @Override
    protected void stop() {
        System.err.println("宝马车停车了是这样的");
    }

    @Override
    protected void alarm() {
        System.err.println("宝马车启动滴滴");
    }

    @Override
    protected void engineBoom() {
        System.err.println("宝马车发动引擎");
    }
}
