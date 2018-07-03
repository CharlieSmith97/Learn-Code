package Java核心类库_网络编程;
//网络编程概述 InetAddress 演示IP操作

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class P375 {
    public static void main(String[] args) throws UnknownHostException, IOException {
        /*
        static InetAddress getByName(String host) 
        确定主机名称的IP地址。 
        在系统信息里面获取主机名称以此来抓取IP地址！
         */
        InetAddress ip=InetAddress.getByName("Thinkpad-缄默");
        //因为sout默认打印IP是IP的toString方法！ 所以可以引出toString的构造结构以此来获取toString相关的方法信息！
        System.out.println(ip.toString());
        //获取主机名称：
        System.out.println(ip.getHostName());
        //获取IP地址：
        System.out.println(ip.getHostAddress());
        //返回本机的IP
        System.out.println(InetAddress.getLocalHost());
        /*
        boolean isReachable(NetworkInterface netif, int ttl, int timeout) 
        测试该地址是否可达。 
        long timeout;
        timeout 因为单位是毫秒所以给定的值 1000=1s ！
        */
        if (InetAddress.getLocalHost().isReachable(100000)) {
            System.out.println("连接超时！");
        }else{
            System.out.println("连接成功！");
        }
    }
}
