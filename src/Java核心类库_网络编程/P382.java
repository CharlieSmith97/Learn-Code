package Java核心类库_网络编程;
//TCP简单程序 服务端 Server

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class P382 {
    public static void main(String[] args) throws IOException {
        //创建服务端 指定端口为 8888
        ServerSocket SS=new ServerSocket(8888);
        System.out.println(SS+"已经准备就绪！");
        /*
        等待客户端连接进来！ 接受连接服务端的客户端对象   
        Socket accept() 侦听要连接到此套接字并接受它。
        */  
        Socket client=SS.accept();
        //返回此服务器套接字的本地地址。 
        System.out.println("已连接过来的客户端："+client.getInetAddress());
        Output(client,"开始了没？");
        SS.close();
    }
    //声明一个方法对客户端做反馈处理的 反馈出自己想要的内容！ 输出流！ OutputStream
    private static void Output(Socket client,String str) throws IOException{
        OutputStream out=client.getOutputStream();
        PrintStream pt=new PrintStream(out);
        pt.println(str);
        pt.close();  
    }
}
