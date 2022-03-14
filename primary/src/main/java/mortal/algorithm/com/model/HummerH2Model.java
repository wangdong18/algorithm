package mortal.algorithm.com.model;

/**
 * @author mortal
 * @create 2021/9/16 11:27
 */
public class HummerH2Model extends HummerModel{

    private boolean alarmFlag = false;
    @Override
    protected void start() {
        System.err.println("宝H2启动");
    }

    @Override
    protected void stop() {
        System.err.println("宝马H2停车");
    }

    @Override
    protected void alarm() {
        System.err.println("宝马H2鸣笛");
    }

    @Override
    protected boolean isAlarm() {
        return alarmFlag;
    }

    @Override
    protected void engineBoom() {
        System.err.println("宝马H2发动引擎");
    }
}
