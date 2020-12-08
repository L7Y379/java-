package Greedy_algorithm;
import java.util.Arrays;
/**
 *  问题定义
 * 设：有n个活动的集合E={1,2,…,n}
 * 其中：每个活动都要求竞争使用同一资源（如演讲会场等），而在同一时间内只有一个活动能使用这一资源
 * 每个活动 i 都有一个请求使用该资源的起始时间 si
 * 每个活动 i 都有一个使用资源的结束时间 fi，且 si < fi
 * 如果选择了活动 i，则它在半开时间区间[si, fi)内占用资源
 * 若区间[si, fi)与[sj, fj)不相交，则称活动i与活动j是相容的
 * 也就是说，当 si ≥ fj 或 sj≥fi 时，活动i与活动j相容
 * 活动安排问题就是要在所给的活动集合中，选出最大的相容活动子集合，即使得尽可能多的活动能兼容地使用公共资源
 */
public class Greedy_algorithm1 {
    public static void main(String[] args) {
        //定义活动起始时间
        int[] s = {2, 2, 3, 4, 6, 7, 9, 10, 13};
        //定义活动截止时间
        int[] f = {3, 4, 5, 7, 8, 11, 12, 15, 17};
        //初始化活动安排数组
        boolean a[ ]=new boolean[9];
        int count=greedySelector(s, f, a);
        System.out.print("可以安排最多活动数为:");
        System.out.println(count);
        System.out.println("可以安排的活动依次为:");
        for(int i=0;i<=8;i++){
            if(a[i]==true){
                System.out.print((i+1)+",\t");
            }

        }
    }
    public static int greedySelector(int s[ ] , int f[ ],  boolean a[ ])
    {
        int n=s.length-1;
        a[0]=true;
        int j=0;   int count=1;
        for (int i=1;i<=n;i++) {
            if (s[i]>=f[j]) { a[i]=true; j=i; count++; }
            else a[i]=false;
        }
        return count;
    }

}
