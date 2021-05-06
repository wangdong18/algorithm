package mortal.algorithm.com.sort;

import java.util.Arrays;

/**
 * 快速排序
 * @Author: mortal
 * @Date: 2021/5/6 21:27
 */
public class QuickSort {
    static Integer[] integers = {1, 2, 5, 4, 6, 1, 9, 8};

    public static void main(String[] args) {
        sort(integers,0,integers.length-1);
        System.err.println(Arrays.toString(integers));
    }
    private static  void  sort(Integer[] integers,int low,int hight){
        int i,j;
        Integer integer;
        if (low > hight) {
            return;
        }
        i = low;
        j = hight;
        integer = integers[i];
        while (i < j) {
            while (i < j && integers[j] >= integer) {
                j--;
            }
            if (i < j) {
                integers[i++] = integers[j];
            }
            while (i < j && integers[i] < integer){
                i++;
            }
            if (i < j) {
                integers[j--] = integers[i];
            }
        }
        integers[i] = integer;
        sort(integers,low,i-1);
        sort(integers,i+1,hight);
    }

}
