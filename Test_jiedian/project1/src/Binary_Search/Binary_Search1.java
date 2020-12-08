package Binary_Search;
import Quick_sort.Quick_sort1;

import java.util.Arrays;

/**
 * 二分搜索算法
 * 算法复杂度分析:
 * 每执行1次算法的while循环， 待搜索数组的大小减少一半。因此，在最坏情况下，while循环被执行了O(logn)次。
 * 循环体内运算需要O(1)时间，因此整个算法在最坏情况下的计算时间复杂性为O(logn)
 */
public class Binary_Search1 {
    public static void main(String[] args){
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0,56,68,78,54};
        //先对数组进行排序
        Quick_sort1.quickSort(arr,0, arr.length-1);
        System.out.println("数组按从小到大排序为排序结果:" + Arrays.toString(arr));
        //二分搜索
        int target=10;
        int result=Binary_search(arr ,0,arr.length-1,target);
        System.out.println("元素"+target+"在数组中的位置为"+result);

    }
    /**
     * 搜索指定要搜索元素在数组中是索引
     *
     * @param arr：要二分搜索的数组
     * @param target：要查找的关键字
     * @param left：起始索引
     * @param righ：结尾索引
     * @return：若搜索到这个元素，则返回数组的索引下标；否则返回-1
     */

    public static int Binary_search(int[] arr, int left, int righ,int target){
        while (left <= righ) {
            int mid = (left + righ) / 2;
            if (arr[mid] > target) {
                righ = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
