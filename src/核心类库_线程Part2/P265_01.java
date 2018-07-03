package 核心类库_线程Part2;
//共享的资源对象

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class P265_01 {

    private String name;
    private String gendex;
    private boolean isEmpty=true;
    private final Lock lock=new ReentrantLock();
    private Condition Cond=lock.newCondition();
    
    /**
     * 生产者向共享资源对象中存储数据
     *
     * @param name 存储的姓名
     * @param gendex 存储的性别
     */
     public void push(String name, String gendex) {
         lock.lock();//手动获取锁！
        try {
            while(!isEmpty){//当isEmpty==flase 就要释放锁 启动消费线程（因为线程释放时会随机启动别的线程 而这里面只有两个线程 非此即彼启动消费线程）
               Cond.await();
            }
            //----------生产开始！---------------------
            for (int i = 0; i <5; i++) {
            this.name = name;
            Thread.sleep(10);
            this.gendex = gendex;
            }
            //----------生产结束！---------------------
            isEmpty=false;
            Cond.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally{
            lock.unlock();//手动解锁(释放)！
        }
    }
        //while与if的区别： if是直接判断然后往下执行，while是判断一次之后再回过头来再判断一次！（数据之间的安全性能更高！）            
    /**
     * 消费者从共享资源中取资源
     */
     public void popup() {
         lock.lock();//手动加锁(获取)
        try {
            while(isEmpty){
                Cond.await();
            }
            //----------开始！---------------------
            for (int i = 0; i <5; i++) {
            Thread.sleep(10);
            System.out.println(this.name + "-" + this.gendex);    
            }
            //----------消费结束！---------------------
            isEmpty=true;
            Cond.signal();//释放锁
        } catch (InterruptedException e) {
            e.printStackTrace();//
        }finally{
            lock.unlock();//手动解锁(释放)！
        }
    }
}
         //while与if的区别： if是直接判断然后往下执行，while是判断一次之后再回过头来再判断一次！（数据之间的安全性能更高！）