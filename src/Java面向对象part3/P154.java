    /*
    多态的好处    注意  其中实例化一个对象的时候   如果本包中没有相对应的方法 
    可能会调用该包外的的方法  如果本包中定义了的话 会按照就近原则调用相对应的方法
    */
package Java面向对象part3;

//多态的引用 
public class P154 {
    public static void main(String[]args){
       person1 p=new person1();
        cat c=new cat();
        p.feed(c);
        dog d=new dog();
         p.feed(d);
    }
}
 class person1{ 
        /*
           定义一个喂养员类  然后写入喂养方法 在写喂养方法的时候传入参数类型以及参数  
          比如说Dog类型对应的则是狗的喂养方法  然后在里面调用eat方法   
        */
      //喂养狗的方法
     public void feed(dog d){
         System.out.println("feeding.................");
         d.eat();
     }
     // 这个喂养方法中的（dog d）等价于 dog d=new dog   下面则接着调用相对应的eat方法 
     public void feed(cat c){
         System.out.println("feeding.................");
         c.eat();
     }
 }
 class dw{
     public void eat(){
         System.out.println("吃一般的食物！");
     }
 }
 class dog extends dw{
     @Override  //@Override  检测一个方法重载是否存在问题  如果存在问题的话则运行不了
     public void eat(){
         System.out.println("我要吃肉骨头！");
     }
 }
//切记 在一个包里面定义的类名 要言简意赅   
class cat extends dw{
      @Override
      public void eat(){
        System.out.println("我要吃鱼！哈哈");
    }
}
/*
   缺陷： 针对于不同类型的动物要提供不同的feed方法来喂养   
    代码不够优雅
*/