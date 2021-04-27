package mortal.algorithm.com.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * @Author: mortal
 * @Date: 2021/4/27 20:26
 */
public class BubbleSort {
    static Integer[] bubbleSort = {1, 2, 3, 4, 5, 7, 6, 8};

    public static void main(String[] args) {
        System.err.println("冒泡结果" + Arrays.toString(bubbleSort(bubbleSort)));
    }



    /**
     * 拿到所有的数据
     * 相邻两个进行比较  符合条件的修改顺序
     * <p>最后一个一定是满足最大或最小的值
     * 剩下的除了最后一个的值外在进行上面的循环跳进
     * 多次往复即可
     *
     *
     * @param integers
     * @return
     */
    public static Integer[]  bubbleSort(Integer[] integers) {
        for (int i = 0; i < integers.length-1; i++) {
            for (int j = 0; j < integers .length- 1 - i; j++) {
                if (integers[j] < integers[j+1]) {
                    Integer temp = integers[j];
                    integers[j] = integers[j+1];
                    integers[j+1] = temp;
                }
            }
        }
        return integers;
    }
}
