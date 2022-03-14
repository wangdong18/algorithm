package mortal.algorithm.com.builder;


/**
 * @author mortal
 * @create 2021/9/27 11:38
 */
public class BenzModel extends  CarModel{
    @Override
    protected void start() {
        System.err.println("奔驰车开始启动");
    }
    @Override
    protected void stop() {
        System.err.println("奔驰车停下来了");
    }
    @Override
    protected void alarm(){
        System.err.println("奔驰车鸣笛");
    }
    @Override
    protected void engineBoom(){
        System.err.println("奔驰车发动引擎");
    }
}
