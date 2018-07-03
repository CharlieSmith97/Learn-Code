//测试Demo
package 核心类库_线程Part2;

public class P261_03 {
    public static void main(String[] args) {
        //创建消费者和生产者对象共同的资源对象
       P261_01 resoure=new P261_01();
       //启动生产者线程
       new Thread(new P261(resoure)).start();
       //启动消费者线程
       new Thread(new P261_02(resoure)).start();
    }
}
