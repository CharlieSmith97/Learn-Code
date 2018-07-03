//异常处理机制
package 语言核心;

public class P227 {
    public static void main(String[] args) {
         Car c=new Car();
         Worker worker1=new Worker(c);
         if (worker1.GOWORK()==Worker.LATE) {
             System.out.println("老板："+"\n扣工资！没什么好解释的！");
        } else {
             System.out.println("老板："+"\n表现不错！");
        }
    }
}
class Car{
    public static final int NO_OK=0;
    public static final int OK=0;
    public int run(){
        int a=2;
        if (a==2) {
            System.out.println("爆胎了！");
            return NO_OK;
        } else {
            System.out.println("开车去上班，美滋滋！");
            return OK;    
        }
    }
}

class Worker{
    public static final int LATE=0;
    public static final int IN_TIME=1;
    private Car  car=null;
    public Worker(Car car){
        this.car=car;
    }
    public int GOWORK(){
        if (car.run()==Car.NO_OK){
            walk();            
            return LATE;
        } else {
            System.out.println("开车到公司，吃了早餐，岂不是美滋滋！");
            return IN_TIME;
        }
    }
       private void walk() {
           System.out.println("走路去上班，这社会是真的险恶！");
    } 
}
/**
 * 针对于上述没有异常机制的缺点，我们提出解决方案：
 *  1.把不同类型的异常情况描述成不同类（异常类）
 *  2.分离异常流程代码和正确的流程代码
 *  3.灵活处理异常，如果当前方法处理不了那个应该交给调用者来完成
 */
