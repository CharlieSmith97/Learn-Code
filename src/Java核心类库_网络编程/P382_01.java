package Java核心类库_网络编程;
//TCP简单程序 客户端 Client

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class P382_01 {
    public static void main(String[] args) throws IOException {
        //创建客户端套接字对象 并与服务端对接！连接服务端的主机与端口 
        Socket Sk=new Socket("localhost",8888);
        //扫描流对 输入进来的信息做扫描操作 如果读取到了信息且信息不为空的话则对信息做打印操作！
        Scanner sc=new Scanner(Sk.getInputStream());
        while(sc.hasNextLine()){
            String line=sc.nextLine();
            System.out.println(line);
        }
        sc.close();
        Sk.close();
    }
}
