package mortal.algorithm.com.model;

/**
 * 模板方法模式
 * 产生汽车抽象类
 * @author mortal
 * @create 2021/9/16 10:33
 */
public abstract class HummerModel {

    /**
     * 启动
     */
    protected abstract void start();

    /**
     * 停止
     */
    protected abstract void stop();

    /**
     * 喇叭
     */
    protected abstract void alarm();

    /**
     * 喇叭
     */
    protected  boolean  isAlarm(){
        return false;
    };

    /**
     * 引擎声音
     */
    protected abstract void engineBoom();

    /**
     * 跑起来
     */
    final public void run(){
        this.start();
        this.engineBoom();
        if(!this.isAlarm()){
            this.alarm();
        }
    };
}
