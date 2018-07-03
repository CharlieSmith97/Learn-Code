//P157
package 组合关系实例;

public class AnimalDemo {
    public static void main(String[]args){
        miao M=new miao();
        M.sleep2();
    }
}
 class Animal2{
     public void sleep(){
         System.out.println("卖个萌！"+"\n发呆中................"+"\n睡着了！");
     }
 }
//利用继承对方法的复写
 class ah extends Animal2{
     @Override
     public void sleep(){
         super.sleep();
     }
 }
//组合关系   直接在类里面传建一个原始类 然后再接着调用原始类里面的方法  因为这个miao不涉及extends继承 所以不叫做父类
 class miao {
     private Animal2 a=new Animal2();
    public void sleep2(){
     a.sleep();
 }
 }