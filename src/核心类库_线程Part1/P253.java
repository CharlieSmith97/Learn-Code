//线程不安全问题分析
package 核心类库_线程Part1;
    public class P253 {
        public static void main(String[] args) {
        Apple1 a=new Apple1();
        new Thread(a,"小黄").start();
        new Thread(a,"小明").start();
        new Thread(a,"小黑").start();
    }
}

 class Apple1 implements Runnable{
     private int apple=50;
     @Override
    public void run() {
    for (int i = 0; i < 50; i++) {
            if (apple>0) {
                String name=Thread.currentThread().getName();
                //没吃一个苹果，数量也相应的会减少一个，所以每次执行一次都是以apple为遍历说明的
                System.out.println(name+"吃了"+apple+"编号的苹果！");
                //返回父类中的名称
                //利用currentThread获取当前线程对象！
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                  apple--;
            }
        }
    }
 }
/*
    本程序随即出现的问题：
        1.可能会出现同乡的编号几次  
        在抢占资源的时候延迟所以没打印出来！
        还有可能出现零或者负数之类的 
        主要是线程在抢同一个数的时候进行递减，编号随即递减从0至负一
        要解决上述的多线程并发访问一个资源的安全性问题：
          解决方案：    
            保证打印苹果编号和苹果总数保持一致（同步完成！）。
            A线程进入操作的时候，B线程只能等着，A结束之后BC才有机会进行线程的操作！
               1.同步代码块
               2.同步方法
               3.锁机制（Lock） 
*/