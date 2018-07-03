//隐藏问题
package Java面向对象part3;

public class P151 {
   public static void main(String []args){
       new subclass().doWork();
   } 
}
 class superclass{
     public String name="superClass.name";
     public static void xxxx(){}
 }
 class subclass extends  superclass{
     public int name=18;//其中隐藏了父类中的name字段   而覆盖/写是不能运用到字段当中的
     public void doWork(){
         boolean name=true;
         System.out.println(name);//会优先调用就近的相同的字段
         System.out.println(this.name);//输出调用父类中的中的name字段 
         System.out.println(super.name);//输出本类中的name字段 
     }
      public static void xxxx(){}//隐藏不叫覆盖
 }