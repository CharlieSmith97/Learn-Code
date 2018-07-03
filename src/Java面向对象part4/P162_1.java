//final修饰的方法：
package Java面向对象part4;

public class P162_1 {
    public static void main(String[]args){
        System.out.println("Hey Boy!");
    }
}
 
class aj{
    public final void  dowork(){
        System.out.println("上班上班！");
    }
}
class bj extends aj{
//   @Override
  /*
    public final void  dowork(){
       //报错结果为： bj中的dowork无法覆盖aj中的dowork（）被覆盖的方法为final
   } 
   */
}