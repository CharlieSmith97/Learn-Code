
package Java面向对象part3;

public class P155 {
    public static void main(String []args){
        SupCls  clz=new sub();
        clz.doWork();  
    }
 }
 class SupCls{
     public  static  void doWork(){
      System.out.println("Super.doWork!");
     }
 }
 class sub extends SupCls{
     public static void doWork(){   //隐藏关系
         System.out.println("Sub.doWork!");
     }
 }