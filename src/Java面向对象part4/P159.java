//字段不存在多态特征
package Java面向对象part4;

public class P159 {
    public static void main(String[]args){
        SuperClass clz=new SubClass();
        clz.doWork();//Sub.doWork
        System.out.println(clz.name);//Super.name
    }
}
class  SuperClass{
    public String name="Super.name";
    public void doWork(){
    System.out.println("Super.doWork");
    }
} 
class SubClass extends SuperClass{
    public String name="Sub.name";
    @Override
    public void doWork(){
        System.out.println("Sub.doWork");    
    }
}