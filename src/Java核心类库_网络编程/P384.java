package Java核心类库_网络编程;
//UDP的接收端 Receive DatagramSocket

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class P384 {
    public static void main(String[] args) throws SocketException, IOException {
        //创建接收端对象
        DatagramSocket DS=new DatagramSocket(8888);
        //接收数据 并且判断里面的数据是否为空！ 不为空的话则打印数据！
        //建立缓冲区 
        byte[] bt=new byte[1024];
        DatagramPacket DP=new DatagramPacket(bt,1024);
        /*
        从此套接字接收数据报包。 当此方法返回时， DatagramPacket的缓冲区将填充接收到的数据。 数据包数据包还包含发送者的IP地址和发件人机器上的端口号。 
        该方法阻塞，直到接收到数据报。 数据报包对象的length字段包含接收到的消息的长度。 如果消息长于数据包的长度，消息将被截断。 
        如果有安全管理员，如果安全管理员的checkAccept方法不允许，则无法接收到数据包。 
        参数 
        */
        DS.receive(DP);//接收方法 接收数据报包对象 DP
        //获取接收的数据
        String mes=new String(DP.getData(),0,DP.getLength());
        System.out.println("发送过来的数据："+mes);
    }
}
