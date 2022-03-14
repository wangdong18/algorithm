package mortal.algorithm.com.collect;

/**
 * 栈相关操作 先进后出
 *  构造 插入 查询 移除 查看长度和是否是空的和满的判断
 * @author mortal
 * @create 2021/6/8 12:44
 */
public class Stack {
    long arr[];
    int index;

    public Stack(){
        arr = new long[5];
        index = -1;
    }

    public Stack(int length){
        arr = new long[length];
        index = -1;
    }

    public  void pop(long var){
        arr[++index] = var;
    }

    public long peak(){
        return arr[index];
    }

    public long push(){
        return arr[index--];
    }

    public  boolean isFull() {
        return arr.length == index+1;
    }

    public  boolean isEmpty() {
        return index == -1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(4);
        stack.pop(29);
        stack.pop(1);
        stack.pop(5);
        stack.pop(100);
        stack.push();
        stack.pop(99);


        System.err.println(stack.peak());
        System.err.println(stack.peak());
        System.err.println(stack.isFull());

        while (!stack.isEmpty()){
            System.err.print(stack.push()+",");
        }
    }

}
