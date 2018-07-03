
package Java面向对象part3;

public class P153 {
    public static void main(String[]args){
        Animal a=new Dog();
        a.eat();
        a=new Cat();
        a.eat();
    }
}
class Animal{
     public void eat(){
         System.out.println("吃一般的食物！");
     }
 }
  class Dog extends Animal{
      public void eat(){
          System.out.println("吃肉骨头！");
      }
  }
  class Cat extends Animal{
      public void eat(){
          System.out.println("猫要吃鱼！");
      }
  }
 /*
    三种动物之间是继承关系 现在
 */