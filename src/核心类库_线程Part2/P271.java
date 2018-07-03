    //271后台线程
package 核心类库_线程Part2;

public class P271{ 
    public static void main(String[] args) {
      /*
        String name;
        name=Thread.currentThread().getName();
        System.out.println(name);
        判断一个线程是否为后台线程  后台线程的子线程为后台线程  但是创建的线程可以设置为后台线程!
        */
        boolean a= Thread.currentThread().isDaemon();
        System.out.println(a);
        for (int i = 0; i < 30; i++) {
            System.out.println("Main:"+i);
            if(i==10){
               AA a1=new AA();
               a1.setDaemon(true);//设置子线程为后台线程！
               a1.start();
            }
        }
    }
}
 class AA extends Thread{
    @Override
    public void run() {
         for (int i = 0; i < 10; i++) {
             System.out.println(super.getName()+"-"+super.isDaemon());
        }
    }
     
 }