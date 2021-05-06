package mortal.algorithm.com.sort;

import java.util.Arrays;

/**
 * 希尔排序
 * @Author: mortal
 * @Date: 2021/5/6 21:17
 */
public class ShellSort {
    static Integer[] integers = {1, 2, 5, 4, 6, 1, 9, 8,7};

    public static void main(String[] args) {
        sort(integers);
        System.err.println(Arrays.toString(integers));
    }
    private static void sort(Integer[] integers){
        Integer temp;
        for (int i = integers.length/2;i>0; i/=2) {
            for (int j = i; j < integers.length; j++) {
                for (int k = j; k >=i ; k-=i) {
                    if(integers[k-i]>integers[k]){
                        temp=integers[k-i];
                        integers[k-i]=integers[k];
                        integers[k] = temp;
                    }
                }
            }
        }
    }

}
