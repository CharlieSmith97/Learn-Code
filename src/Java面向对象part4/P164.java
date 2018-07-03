//单例设计模式   
package Java面向对象part4;

public class P164 {
    public static void main(String[]args){
        ArrayUtil.getInstance().sort1(null);
        ArrayUtil.getInstance().sort1(null);
        ArrayUtil.getInstance().sort1(null);
        System.out.println(ArrayUtil.getInstance()==ArrayUtil.getInstance());
        //因为里面创建了单例设计模式 只有单个对象所以一定会相等的
    }
}
class ArrayUtil{
    //在类中创建一个对象 一旦定义之后就不能改变了  所以习惯性的加了一个final修饰符
    private static final ArrayUtil instance=new ArrayUtil();
    //对构造器的私有化防止外界通过构造器创建新的对象 除了作用于之后就没用了 利用了最基本的性质
    private ArrayUtil(){
    }
    //向外面包录一个方法来获取滋生的对象
    public static ArrayUtil getInstance(){
        return instance;//返回对象本身  然后外界通过对象名点方法的方式得出自己想要的结果
    }
      public void sort1(int[] arr){
          System.out.println("顺序操作！");
}
}
  