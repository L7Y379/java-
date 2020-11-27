package Quick_sort;

import java.util.Arrays;

/**
 * 第一个元素为枢纽的快速排序
 */
public class Quick_sort2 {
    public static void main(String[] args){
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0,55,68,78,54,88,21,54,18,16,79,24,26,47,68,45,96,33,55,77,13,64,57,85,22,11,66,99,88,44};
        System.out.println("需要排序的数组为：" + Arrays.toString(arr));
        long startTime = System.nanoTime();
        quicksort(arr, 0, arr.length - 1);
        long endTime= System.nanoTime();
        System.out.println("第一个元素为枢纽的排序结果:" + Arrays.toString(arr));
        System.out.println("第一个元素为枢纽的算法耗时为：" + (endTime - startTime) + "ns");
    }

    public static void quicksort(int[] arr,int left,int right){
        if (right <= left) return;
        int i = left;
        int j = right + 1;
        int key = arr[left];
        while (true)
        {
            /*从左向右找比key大的值*/
            while (arr[++i] < key)
            {
                if (i == right){
                    break;
                }
            }
            /*从右向左找比key小的值*/
            while (arr[--j] > key)
            {
                if (j == left){
                    break;
                }
            }
            if (i >= j) break;
            /*交换i,j对应的值*/
            swap(arr, i, j);
        }
        /*中枢值与j对应值交换*/
        swap(arr, left, j);
        quicksort(arr, left, j - 1);
        quicksort(arr, j + 1, right);

    }


    /**
     * 交换元素通用处理
     *
     * @param arr
     * @param a
     * @param b
     */
    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}