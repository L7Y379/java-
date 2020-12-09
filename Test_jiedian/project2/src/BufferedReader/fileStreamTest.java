package BufferedReader;

/**
 * 该流用于从文件读取数据，它的对象可以用关键字 new 来创建。
 *
 * 有多种构造方法可用来创建对象。
 *
 * 可以使用字符串类型的文件名来创建一个输入流对象来读取文件：
 *
 * InputStream f = new FileInputStream("C:/java/hello");
 * 也可以使用一个文件对象来创建一个输入流对象来读取文件。我们首先得使用 File() 方法来创建一个文件对象：
 *
 * File f = new File("C:/java/hello");
 * InputStream f = new FileInputStream(f);
 * 创建了 InputStream 对象，就可以使用下面的方法来读取流或者进行其他的流操作。
 */
//可能会出现乱码
//下面的程序首先创建文件 test.txt，并把给定的数字以二进制形式写进该文件，同时输出到控制台上。
//
//以上代码由于是二进制写入，可能存在乱码
import java.io.*;

public class fileStreamTest {
    public static void main(String args[]) {
        try {
            byte bWrite[] = { 11, 21, 3, 40, 5 };
            OutputStream os = new FileOutputStream("test.txt");
            for (int x = 0; x < bWrite.length; x++) {
                os.write(bWrite[x]); // writes the bytes
            }
            os.close();

            InputStream is = new FileInputStream("test.txt");
            int size = is.available();

            for (int i = 0; i < size; i++) {
                System.out.print((char) is.read() + "  ");
            }
            is.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}