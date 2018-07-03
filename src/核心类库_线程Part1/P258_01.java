//同步锁！
package 核心类库_线程Part1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class P258_01 {

    public static void main(String[] args) {
        app a = new app();
        new Thread(a, "小黄").start();
        new Thread(a, "小明").start();
        new Thread(a, "小黑").start();
    }
}

class app implements Runnable {

    private int apple = 50;
    private final static Lock lock = new ReentrantLock();//创建一个锁对象！

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            eat();
        }
    }

    //保证现成的安全问题
    private void eat() {
        //进入方法里面：立马加锁！
        lock.lock();//获取锁！  
        try {
            if (apple > 0) {
                System.out.println(Thread.currentThread().getName()+ "吃了第" + apple + "个苹果！");
                Thread.sleep(10);
                apple--;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();//释放锁！
        }
    }
}
