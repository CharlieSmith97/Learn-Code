package Java核心类库_网络编程;
//使用TCP简单模拟 TomCat服务器

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class P383 {

    public static void main(String[] args) throws IOException {
        ServerSocket sk = new ServerSocket(9999);
        while (true) {
            Socket client = sk.accept();
            OutputStream out = client.getOutputStream();
            PrintStream pr = new PrintStream(out);
            File f1 = new File("D:\\dos编译", "Demo1.html");
            Scanner sc = new Scanner(f1);
            while (sc.hasNextLine()) {
                pr.println(sc.nextLine());
                pr.close();
            }
        }
    }
}
