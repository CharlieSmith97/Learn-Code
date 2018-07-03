/*
    Java核心内库-线程-吃苹果比赛-使用继承方式
        方式1：
            实现继承Thread的方式实现多线程（三个同学吃五十个苹果）的操作！
*/
package 核心类库_线程Part1;

public class P250 {
    public static void main(String[] args) {
        //创建三个线程 吃苹果！
        new Person("小黄").start();
        new Person("小明").start();
        new Person("小杰").start();
    }
}
    //每一个同学为一个线程对象
class Person extends Thread{
    private int apple=50;//定义苹果总数
    Person(String name) {
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if (apple>0) {
                //返回父类中的名称
                System.out.println(super.getName()+"吃了"+apple+"编号的苹果！");
            }
        }
    }
}
/**
 * 使用继承方式完成该案例的时候：
 *  每一个线程都执行了50次 
 */