
package 语言核心;

/**
 *
 * @author 甘柳
 */
public class P227_Exception {
    public static void main(String[] args) {
        Car1 c=new Car1();
        Worker1 wok=new Worker1(c);
        try {
            wok.GOWORK();
            System.out.println("老板，给我奖金！");
        } catch (WorkException e) {
            System.out.println("扣工资！妈的！");
            e.printStackTrace();
        }
    }
}
class Car1{
    public void run()throws CarWrongException{
        int a=1;
        if (a==2) {
            throw new CarWrongException("车爆胎了！");
        }   
    }
}

class Worker1{
    private Car1  car=null;
    public Worker1(Car1 car){
        this.car=car;
    }
    public void GOWORK(){
            try {
            car.run(); 
           System.out.println("开车去上班，美滋滋！");
        }catch (CarWrongException e) {
            e.printStackTrace();
            //车抛锚了！
            this.walk();
            throw new WorkException("迟到的原因："+e.getMessage(),e);
        }
           
    }
       private void walk() {
           System.out.println("走路去上班，这社会是真的险恶！");
    } 
}
   class CarWrongException extends RuntimeException{
       private static final long serialVersionUID=1L;
       public CarWrongException(){
           
       }
       public CarWrongException(String message){
           super(message);
       }
       public CarWrongException(String message,Throwable cause){
           super(message,cause);
       }
   }

       class WorkException extends RuntimeException{
       private static final long serialVersionUID=1L;
       public WorkException(){
           
       }
       public WorkException(String message){
           super(message);
       }
       public WorkException(String message,Throwable cause){
           super(message,cause);
       }
   }