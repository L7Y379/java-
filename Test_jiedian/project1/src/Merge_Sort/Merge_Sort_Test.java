package Merge_Sort;
import java.util.Arrays;
/**
 * 二路归并排序算法
 * 他的时间复杂度为O(nlogn)
 * 额外复制一遍目标数组用于匹配，因此空间复杂度为O(n)
 *
 */
public class Merge_Sort_Test {
    public static void main(String[] args) {
        int []arr={9, 8, 7, 6, 5, 4, 3, 2, 1, 0,55,68,78,54,88,21,54,18,16,79,24,26,47,68,45,96,33,55,77,13,64,57,85,22,11,66,99,88,44};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    public static void mergeSort(int[]arr,int low,int high ){
        if(low<high){//递归结束条件
            int mid=(low+high)/2;
            mergeSort(arr, low, mid);//左子表递归排列有序
            mergeSort(arr,mid+1,high);//右子表递归排列有序
            merge(arr,low,mid,high);//将两有序子表合并
        }

    }


    public static void merge(int []arr,int low,int mid,int high){//两有序子表合并方法

        int [] temp=new int[100];//这里把要排序数组copy一份，用来比较，原来的数组用来保存比较后的信息
        for(int i=low;i<=high;i++){//注意这里copy时，下标是从low开始的，要是为了保证copy的数组下标与目标数组下标一致，这样是为了方便后面的比较的下标操作
            temp[i]=arr[i];//当然copy的数组保存时也可以从0开始保存，但是这样就要注意后面的比较操作时，i就不是小于mid了，而是小于mid-low，j也不是小于high，j是小于high-low

        }
        int i=low,j=mid+1,k=low;//把数组分为前后相同的两端进行比较。i指向前半段，j指向后半段，k指向要保存的位置
        for(;i<=mid&&j<=high;k++){//比较
            if(temp[i]<temp[j])arr[k]=temp[i++];
            else arr[k]=temp[j++];

        }
        while(j<=high)//若第一个表没检测完，复制
            arr[k++]=temp[j++];

        while(i<=mid)//若第二个表没检测完，复制
            arr[k++]=temp[i++];
    }


}
