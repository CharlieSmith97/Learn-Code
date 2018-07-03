//同步方法解决吃苹果大赛问题！
package 核心类库_线程Part1;

import javax.swing.JOptionPane;

public class P255 {
    public static void main(String[] args) {
        Apple3 a=new Apple3();
        new Thread(a,"小A").start();
        new Thread(a,"小B").start();
        new Thread(a,"小C").start();
    }
}
 class Apple3 implements Runnable{
     private int apple=50;
    @Override
    public void run() {
        for(int i=0;i<50;i++){
            Eat();
        }   
    }
    //同步方法 将需要同步的代码写到同一个方法里面 用synchronized修饰 然后在run方法里面调用该方法！
    synchronized private void Eat(){
           if (apple>0) {
                String Name=Thread.currentThread().getName();
                System.out.println(Name+"同学吃了编号为"+apple+"的苹果！");
                    try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null,"睡眠或以其他方式占用时抛出，线程在活动之前或活动期间中断!");
                }
             apple--;
         }
    }
 }