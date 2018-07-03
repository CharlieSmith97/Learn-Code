package 核心类库_线程Part2;
//共享的资源对象

import java.util.logging.Level;
import java.util.logging.Logger;

public class P261_01 {

    private String name;
    private String gendex;
    private boolean isEmpty = true;//共享资源状态是否为空

    /**
     * 生产者向共享资源对象中存储数据
     *
     * @param name 存储的姓名
     * @param gendex 存储的性别
     */
    synchronized public void push(String name, String gendex) {
        try {
            while(!isEmpty) {
                //当isempty为false的时候，不空等着消费者消费or获取
                this.wait();//释放生产方法 等待消费or获取方法来调用！同步锁调用另外一个线程方法  thsi为当前同步（监听）锁对象！否则报错！
            }
            //----------生产开始！---------------------
            for (int i = 0; i <5; i++) {
            this.name = name;
            Thread.sleep(10);
            this.gendex = gendex;
            }
            //----------生产结束！---------------------
            isEmpty = false;//设置共享资源总数据不为空！
            this.notify();//唤醒消费者
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
        //while与if的区别： if是直接判断然后往下执行，while是判断一次之后再回过头来再判断一次！（数据之间的安全性能更高！）            
    /**
     * 消费者从共享资源中取资源
     */
    synchronized public void popup() {
        try {
            while(isEmpty) {//当isempty为true的时候，等着生产者生产！  
                this.wait();//唤醒生产线程继续生产！
            }//----------消费开始！---------------------
            for (int i = 0; i <5; i++) {
            Thread.sleep(10);
            System.out.println(this.name + "-" + this.gendex);    
            }
            //----------消费结束！---------------------
            isEmpty=true;//消费者为空
            this.notify();//唤醒生产者！
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
         //while与if的区别： if是直接判断然后往下执行，while是判断一次之后再回过头来再判断一次！（数据之间的安全性能更高！）