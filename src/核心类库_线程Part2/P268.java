//线程的生命周期  测试这个线程是否活着。 
package 核心类库_线程Part2;

public class P268 {
    public static void main(String[] args)throws Exception{
        RunnableDemo D1=new RunnableDemo();
        for (int i = 0; i <10; i++) {
            System.out.println("Main:"+i);
            if (i==10) {
                D1.start();
            }
        }
        if(!D1.isAlive()){
            D1.start();
        }
    }
}

class  RunnableDemo extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <50; i++) {
            System.out.println("RunnableDemo-"+i);
        }
    }
}
