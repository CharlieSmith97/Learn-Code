//接口的特点与继承
package Java面向对象part5;

public class P178 {
    public static void main(String[]args){
        //new cat3().walk1();
        Iwalkable w=new cat3();//面向接口编程，存在多态  总的来讲就是类来实现接口的问题
        w.walk1();//体现多态特征：执行cat3中的walk1方法
        ISwimable s=new fish();
        s.siwm();
        frog f1=new frog();
        f1.siwm();
        f1.walk1();
    }
}
    //爬行类动物规范
  interface Iwalkable{
      public void walk1();
  }
    //水生动物规范
  interface ISwimable{
      public void siwm();            
  }
  //Amphibiousable继承了两个父接口 两栖动物规范
  interface Amphibiousable extends Iwalkable,ISwimable{
      
  }
  class animal{ 
  }
  class cat3 extends animal implements  Iwalkable{
        //必须覆盖父类中的中的  子类中的访问权限大于父类中的访问
      @Override
    public void walk1() {
        System.out.println("猫会跳！"+"\n-----------程序结束！--------------");
    }
  }
    class fish extends animal implements ISwimable { 
       @Override
       public void siwm(){
           System.out.println("我会游泳！"+"\n-----------程序结束！--------------");
       }  
    } 
    class frog extends animal implements  ISwimable,Iwalkable{
        public void walk1(){
            System.out.println("我会跳！");
        }
        public void siwm(){
            System.out.println("我还会游泳！");
        }
    }