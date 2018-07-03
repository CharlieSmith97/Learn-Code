package Java核心类库_网络编程;
//UDP发送端  Send
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class P384_01 {
    public static void main(String[] args) throws  SocketException, UnknownHostException, IOException{
        //创建发送端对象
        DatagramSocket Dg=new DatagramSocket(6666);
        String str="该配合你演出的我视而不见！";
        //发送数据
        /*
        DatagramPacket
        参数 
        buf - 分组数据。 
        length - 包长度。 
        address - 目的地址。   不知道的话可以直接利用InetAddress.getLocalHost方法来获取本机的IP地址 端口的话就填写接收端的端口号就行！
        port - 目的端口号。
        */
        DatagramPacket DP=new DatagramPacket(str.getBytes(),str.getBytes().length,InetAddress.getLocalHost(),8888);
        Dg.send(DP);
        Dg.close();
    }
}
