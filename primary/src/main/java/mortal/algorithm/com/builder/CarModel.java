package mortal.algorithm.com.builder;

import java.util.List;

/**
 * @author mortal
 * @create 2021/9/27 9:44
 */
public abstract class CarModel {

    List<String> sequence = null;

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    final public void run(){
        if (null == sequence) {
            System.err.println("没有对应的顺序");
        }
        for (String s : sequence) {
            if(s.equalsIgnoreCase("start")){
                start();
            }
            else if(s.equalsIgnoreCase("stop")){
                stop();
            }
            else if(s.equalsIgnoreCase("alarm")){
                alarm();
            }
            else if(s.equalsIgnoreCase("engine boom")){
                engineBoom();
            }
        }
        System.err.println("------------------");
    }
    protected void setSequence(List<String> sequence){
        this.sequence = sequence;
    }

}
