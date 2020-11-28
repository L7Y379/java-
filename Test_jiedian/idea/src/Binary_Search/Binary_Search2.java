package Binary_Search;

import Quick_sort.Quick_sort1;

import java.util.Arrays;

public class Binary_Search2 {
    public static void main(String[] args){
        int[] arr = {9, 8, 7, 6, 5,4, 3, 2, 1,0, 56,68,78,54,79};
        //先对数组进行排序
        Quick_sort1.quickSort(arr,0, arr.length-1);
        System.out.println("数组按从小到大排序为排序结果:" + Arrays.toString(arr));
        //二分搜索
        int target=77;
        Binary_search(arr ,0,arr.length-1,target);

    }
    /**
     * 搜索指定要搜索元素在数组中是索引
     *
     * @param arr：要二分搜索的数组
     * @param target：要查找的关键字
     * @param left：起始索引
     * @param righ：结尾索引
     * @return：若搜索到这个元素，则返回数组的索引下标；否则返回小于x的最大元素位置i 和大于x的最小元素位置 j
     */

    public static void Binary_search(int[] arr, int left, int righ,int target){
        while (left <= righ) {
            int mid = (left + righ) / 2;
            if (arr[mid] > target) {
                righ = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                System.out.println("搜索元素"+target+"在数组中！且搜索元素"+target+"在数组中位置为:"+mid);
                return;
            }
        }
        System.out.println("搜索元素不在数组中！且小于搜索元素"+target+"的最大元素位置为:"+righ+" ，大于搜索元素"+target+"的最小元素位置为:"+left);
        return;
    }
}
