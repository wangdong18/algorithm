package mortal.algorithm.com.sort;

import java.util.Arrays;

/**
 * 归并排序
 * @author mortal
 * @create 2021/4/29 12:42
 */
public class MergeSort {
    static Integer[] integers = {1, 4, 3, 2, 5, 6, 7, 0, 8};

    public static void main(String[] args) {
        mergeSort(integers);
        System.err.println(Arrays.toString(integers));

    }
    public static  void mergeSort(Integer[] integers) {
        Integer[] temp = new Integer[integers.length];
        mergeSort(integers, 0, integers.length-1, temp);
    }

    public  static  void mergeSort(Integer[] integers,int left,int right,Integer[] temp) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(integers, left, mid, temp);
            mergeSort(integers, mid+1, right, temp);
            merger(integers, left, mid, right, temp);
        }
    }


    public static void merger(Integer[] integers,int left,int mid,int right,Integer[] temp){
        int i = left;
        int j = mid + 1;
        int t = 0;
        while (i <= mid && j <= right) {
            if (integers[i] <= integers[j]) {
                temp[t++] = integers[i++];
            }else {
                temp[t++] = integers[j++];
            }
        }
        while (i <= mid) {
            temp[t++] = integers[i++];
        }
        while (j <= right) {
            temp[t++] = integers[j++];
        }
        t = 0;
        while (left <= right) {
            integers[left++] = temp[t++];
        }

    }

}
