//测试Demo
package 核心类库_线程Part2;

public class P265_03 {
    public static void main(String[] args) {
        //创建消费者和生产者对象共同的资源对象
       P265_01 resoure=new P265_01();
       //启动生产者线程
       new Thread(new P265(resoure)).start();
       //启动消费者线程
       new Thread(new P265_02(resoure)).start();
    }
}