package BufferedReader;

// 使用 BufferedReader 在控制台读取字符
//下面的程序读取和显示字符行直到你输入了单词 "end"。

import java.io.*;
public class BRReadLines {
    public static void main(String args[]) throws IOException
    {
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");
        do {
            str = br.readLine();
            System.out.println(str);
        } while(!str.equals("end"));
    }
}