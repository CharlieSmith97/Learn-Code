//演示object类中的方法
package Java面向对象part3;

public class P152 {
   public static void main(String []args){
       String str="ABC";
       //String str=new String("abc")
       System.out.println(str.hashCode());
       Object o1=new Object();
       Object o2=new Object();
       System.out.println(o1.equals(o2));//拿对象o1与o2作比较 
        User u=new User("will",18);
        System.out.println(u);
        System.out.println(u.toString());
        // will,18  will,18
   } 
}
 class User{
     private String name;
     private int age;
     public User(String name,int age){
         this.name=name;
         this.age=age;
     }
     public String toString(){
         return this.name+","+this.age;
     }
 }  
    /*
     PrintStream 类：
     public void println(object x){
        String s=String.valueof(x);
        synchronized(this){
            print(s);
            newLine();
        }
    }//第一个调用第二个方法
    PrintStream类：
     public void print（object obj）{
        write(String.valueof(obj));
    }//第二个调用第三个方法
    String类
    public static String valueof(object obj){
    return (obj=null)?"null":obj.toString;
    三元运算符 如果obj中卫空的话则输出为空，反之则输出相对应的语句
    }
    */