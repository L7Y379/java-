package checkerboard;
import java.util.Arrays;
import java.util.Scanner;
/**
 *  棋盘覆盖问题
 *  在一个2k×2k 个方格组成的棋盘中，有一个方格与其它不同，称该方格为特殊方格，且称该棋盘为一特殊棋盘
 *  棋盘覆盖问题：
 *  要求用图(b)所示的4种L形态骨牌覆盖给定的特殊棋盘
 *  限制条件：覆盖给定特殊棋盘上除特殊方格以外的所有方格
 *  限制条件：任何2个L型骨牌不得重叠覆盖
 */
public class checkerboard_Test {
    public static void main(String[] args){
        int N=16;

        int[][] arr=new int[N][N];
        Scanner in=new Scanner(System.in);
        int i,j,dr,dc;
        System.out.printf("please input dr(0<dr<%d):",N);
        dr=in.nextInt();
        System.out.printf("please input dc(0<dc<%d):",N);
        dc=in.nextInt();
        arr[dr][dc]=0;
        Tromino(arr,dr,dc,0,0,N);
        for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
                System.out.printf("%-4d",arr[i][j]);
            System.out.print("\n");
        }
        //system("pause");
    }
    public static int t=1;
    public static void Tromino(int[][] arr,int dr,int dc,int tr,int tc,int size){
        int s = 0;
        if(size==1) return;
        if(size>1) {
            s=size/2;
            if(dr<=(tr+s-1)&&dc<=(tc+s-1)){       /*特殊方块在左上部分*/
                arr[tr+s-1][tc+s]=t;
                arr[tr+s][tc+s]=t;
                arr[tr+s][tc+s-1]=t;
                t++;
                Tromino(arr,dr,dc,tr,tc,s);//左上角子棋盘递归处理
                Tromino(arr,tr+s-1,tc+s,tr,tc+s,s);//右上角子棋盘递归处理
                Tromino(arr,tr+s,tc+s,tr+s,tc+s,s);//右下角子棋盘递归处理
                Tromino(arr,tr+s,tc+s-1,tr+s,tc,s);//左下角子棋盘递归处理
            }

        }
        if(dr<=(tr+s-1)&&dc>(tc+s-1)){	/*特殊方块在右上部分*/
            arr[tr+s-1][tc+s-1]=t;
            arr[tr+s][tc+s-1]=t;
            arr[tr+s][tc+s]=t;
            t++;
            Tromino(arr,dr,dc,tr,tc+s,s); //右上角子棋盘递归处理
            Tromino(arr,tr+s-1,tc+s-1,tr,tc,s); //左上角子棋盘递归处理
            Tromino(arr,tr+s,tc+s-1,tr+s,tc,s); //左下角子棋盘递归处理
            Tromino(arr,tr+s,tc+s,tr+s,tc+s,s); //右下角子棋盘递归处理
        }
        if(dr>(tr+s-1)&&dc<=(tc+s-1)){	/*特殊方块在左下部分*/
            arr[tr+s-1][tc+s-1]=t;
            arr[tr+s-1][tc+s]=t;
            arr[tr+s][tc+s]=t;
            t++;
            Tromino(arr,dr,dc,tr+s,tc,s);
            Tromino(arr,tr+s-1,tc+s-1,tr,tc,s);
            Tromino(arr,tr+s-1,tc+s,tr,tc+s,s);
            Tromino(arr,tr+s,tc+s,tr+s,tc+s,s);
        }
        if(dr>(tr+s-1)&&dc>(tc+s-1)){	/*特殊方块在右下部分*/
            arr[tr+s][tc+s-1]=t;
            arr[tr+s-1][tc+s-1]=t;
            arr[tr+s-1][tc+s]=t;
            t++;
            Tromino(arr,dr,dc,tr+s,tc+s,s);
            Tromino(arr,tr+s,tc+s-1,tr+s,tc,s);
            Tromino(arr,tr+s-1,tc+s-1,tr,tc,s);
            Tromino(arr,tr+s-1,tc+s,tr,tc+s,s);
        }
    }

}