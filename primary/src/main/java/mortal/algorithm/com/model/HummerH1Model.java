package mortal.algorithm.com.model;

/**
 * 悍马H1启动
 * @author mortal
 * @create 2021/9/16 11:23
 */
public class HummerH1Model extends HummerModel{

    private boolean alarmFlag = true;

    @Override
    protected void start() {
        System.err.println("悍马H1启动");
    }

    @Override
    protected void stop() {
        System.err.println("悍马H1停车");
    }

    @Override
    protected void alarm() {
        System.err.println("悍马H1鸣笛");
    }

    @Override
    protected boolean isAlarm() {
        return alarmFlag;
    }

    @Override
    protected void engineBoom() {
        System.err.println("悍马H1发动引擎");
    }
}
