package mortal.algorithm.com.sort;

import java.util.Arrays;

/**
 * 插入排序
 * @author mortal
 * @create 2021/4/28 9:23
 */
public class InsertSort {
    static Integer[] integers = {1, 4, 3, 2, 5, 6, 7, 0, 8};

    public static void main(String[] args) {
        insertSort(integers);
        System.err.println(Arrays.toString(integers));
    }

    /**
     * 从第一个元素起
     * 将最后一个元素和第一个元素开始比较
     * 交换两个比较值的位置
     * 重复上面的步骤
     * @param integers
     */
    public static  void  insertSort(Integer[] integers) {
        int length = integers.length;
        int preIndex;
        Integer current;
        for (int i = 0; i < length; i++) {
            preIndex = i - 1;
            current = integers[i];
            while (preIndex >= 0 && integers[preIndex] > current) {
                integers[preIndex+1] = integers[preIndex];
                preIndex--;
            }
            integers[preIndex + 1] = current;
        }
    }
}
