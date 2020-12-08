package BackTrack;
import java.util.Arrays;
public class backtrack {
    public static int n=3;
    public static int[] x=new int[3];
    public static void main(String[] args){
        for (int i=0; i < n; i++) {
            x[i] = i+1;
        }
        backtrack(0);
    }
    public static void backtrack (int t) {
        if (t > n-1) System.out.println(Arrays.toString(x));
        else{
            for (int i = t; i < n; i++) {
                swap(t, i);
                backtrack(t+1);
                swap(t, i);
            }
        }
    }
    /**
     * 交换元素通用处理
     *
     * @param a
     * @param b
     */
    private static void swap(int a, int b) {
        int temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }
}
