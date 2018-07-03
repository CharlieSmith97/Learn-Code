package Java核心类库_网络编程;
//URI和URL 

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class P378 {
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url = new URL("http", "localhost", 8080, "/index.jsp");
        //设定一个连接对象
        URLConnection conn = url.openConnection();
        //InputStream getinputStream（）返回从此打开的链接读取的输入流
        //网络数据---->输入--->程序中    
        InputStream in = conn.getInputStream();
        /*
        Scanner sc = new Scanner(in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();
        */
        Files.copy(in,Paths.get("xx.png"));
    }
}
