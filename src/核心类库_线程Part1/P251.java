//使用实现方式来完成吃苹果
package 核心类库_线程Part1;

public class P251 {
    public static void main(String[] args) {
        Apple a=new Apple();
        new Thread(a,"小黄").start();
        new Thread(a,"小明").start();
        new Thread(a,"小黑").start();
    }
}

 class Apple implements Runnable{
     private int apple=50;
     @Override
    public void run() {
         for (int i = 0; i < 50; i++) 
            {
            if (apple>0){
                //返回父类中的名称
                //利用currentThread获取当前线程对象！
                String name=Thread.currentThread().getName();
                //没吃一个苹果，数量也相应的会减少一个，所以每次执行一次都是以apple为遍历说明的
                System.out.println(name+"吃了"+apple--+"编号的苹果！");
            }
        }
    }
 }
    /*
        public static Thread currentThread()
        返回对当前正在执行的线程对象的引用。
          Thread.current().getName()；
        利用thread获取线程对象的名称
        其中在使用实现方式的时候：我们发现A，B，C一共吃了50个苹果，原因是什么？
          结论：
            因为：三个线程共享了一个Apple对象，而一个Apple对象中有50个苹果数量
    */
