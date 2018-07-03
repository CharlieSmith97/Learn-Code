//方法的覆盖
package Java面向对象part3;

public class P147 {
    public static void main(String[]args){
        bird b1=new bird();
        b1.setbird("大雁");
        System.out.println(b1.fly());
        penguin p1=new penguin();
        System.out.println(p1.fly());
    }
}
  class bird{
     private String birder;
      public void setbird(String birder){
          this.birder=birder;
      }
      public String getbird(){
          return birder;
      }
      public String fly(){
         return "我是一只"+birder+"我会飞！";
      }
  }
 class penguin extends bird{
     @Override//用于判断用于之类的方法是否覆盖了
      public String fly(){
          return "我是一只企鹅，并不会飞！";//方法的覆盖或者增加删除 
      }
 }