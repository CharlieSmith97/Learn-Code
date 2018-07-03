//线程优先级操作！
package 核心类库_线程Part2;

public class P272 {
    public static void main(String[] args) {
        //或驱逐现成的优先级别 因为当前线程就是为主线程！
        Thread name = Thread.currentThread();
        System.out.println("该对象的优先级设置前别为："+name.getPriority());
            name.setPriority(7);
        System.out.println("该对象的优先级设置后别为："+name.getPriority());    
        /**
         * 在线程优先级别中
         * max=10；
         * min=1；
         * 默认为5；
         * 所以取值只能在{1~10}之间取优先级别值！
         */
        System.out.println("Action!");
        Priority MAX=new Priority("高优先级");
        MAX.setPriority(Thread.MAX_PRIORITY);
        Priority MIN= new Priority("低优先级");
        MIN.setPriority(Thread.MIN_PRIORITY);
        MAX.start();
        MIN.start();
    }
}
  class Priority extends Thread{
    public Priority(String name) {
        super(name);
    }
    
      @Override
    public void run() {
          for (int i = 0; i < 50; i++) {
              System.out.println(super.getName()+"--"+i);
          }
    }
  }