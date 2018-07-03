//理解super关键字
    //在子类方法中调用父类的方法，去掉用被父类被覆盖的方法
package Java面向对象part3;

public class P149 {
    public static void main(String[]args){
        penguin1 pe1=new penguin1();
        pe1.Song();
    }
}
   class bird1{
       public void fly(){
           System.out.println(" I CAN FLY!");
       }


  }
   class penguin1 extends bird1{
       @Override
       public void fly(){
           System.out.println("I'M SORRY  CAN'T FLY!");
       }
       public void Song(){
         System.out.println("我想唱歌。。。。。。。");
        this.fly();//this调用的是本类中的fly（）方法  super则不同
        super.fly();
        }
        /*
           public void Song(){
           System.out.println("我想唱歌。。。。。。。");
           fly();
       }在同一个类中调用前面一个方法是不行的 需要用到this.的方法调用当前类中前面的方法 
       如果是调用父类中的方法的时候就要用到super.的方法来调用父类中的方法
       */
   }
