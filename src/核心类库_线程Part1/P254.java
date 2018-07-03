//线程不安全问题的解决措施 同步代码块！
package 核心类库_线程Part1;

public class P254 {
    public static void main(String[] args) {
            Apple2 a=new Apple2();
        new Thread(a,"小黄").start();
        new Thread(a,"小明").start();
        new Thread(a,"小黑").start();
    }
}
 class Apple2 implements Runnable{
     private int apple=50;
     @Override
    public void run() {
    for (int i = 0; i < 50; i++) {
        /*
        同步锁：为了保证每个线程都能正常执行原子操作，Java引入了线程同步机制。
        当apple为1的时候 ABC三个线程在抢占资源 
        设置同步锁之后不能重复编号导致A直接输出1 B可能为0 C自然而然就为-1    
            this表示apple的对象，该线程属于多线程共同的对象！
            对象监听器就找这样的！
        */
        synchronized(this){
            if (apple>0) {
                //利用currentThread获取当前线程对象！ 返回父类中的名称
                String name=Thread.currentThread().getName();
                //没吃一个苹果，数量也相应的会减少一个，所以每次执行一次都是以apple为遍历说明的
                System.out.println(name+"吃了"+apple+"编号的苹果！");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                  apple--;
            /*
                因为每次做循环操作都是固定的编号顺序来完成吃苹果操作  
                但是可以设置一个随机数范围让每个同学吃到的苹果不是有序的编号
            */
            }
        }
     }
    }
}