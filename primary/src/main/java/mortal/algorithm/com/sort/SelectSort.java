package mortal.algorithm.com.sort;

import java.util.Arrays;

/**
 *
 * 选择排序
 * @author mortal
 * @create 2021/4/27 16:34
 */
public class SelectSort {

    static Integer[] integers = {1, 2, 5, 4, 6, 1, 9, 8};

    public static void main(String[] args) {
        selectSort(integers);
        System.err.println(Arrays.toString(integers));
    }

    /**
     * 从第一个开始
     * 在剩下的里面找到最小（或者最大）值的位置
     * 交换第一个和最大（或最小）值
     * 剩下的继续找值比较
     * @param integers
     */
    private  static  void selectSort(Integer[] integers) {
        int n=integers.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (integers[j] < integers[min]) {
                    min = j;
                }
            }
            Integer temp = integers[i];
            integers[i] = integers[min];
            integers[min] = temp;
        }
    }

}
