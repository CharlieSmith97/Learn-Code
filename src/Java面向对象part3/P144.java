//面向对象—引出继承关系
package Java面向对象part3;

public class P144 {
    public static void main(String[]args){
            student s=new student();
            s.name="小明";
            s.age=20;
            s.sn="8888";
            System.out.println(s.speak());
            s.sleep();
    }
}
        /*
        注释： 被继承的类 super class 父类/超类/基类/被拓展类
        其中person为父类  而子类包括：student teacher 以及employee 
        而继承关系解决的是代码重复问题
        */
 class person{
     String name;
     int age;
     public void sleep(){
         System.out.println("我正在睡觉！");
    }
 }
   //老师
  class teacher extends person{
    String level;//等级
    public void sleep(){
        super.sleep();
        System.out.println("别吵我！");
    }
  }
    //学生 
   class student extends person{
       String sn;//学号
       public String speak(){
           return "我叫:"+this.name+"\n年龄："+this.age+"\n学号:"+this.sn;
       }
       public void sleep(){
           super.sleep();
           System.out.println("等下睡完就去做作业！");
       }
   }
//公司员工
    class Employee extends person{
        String hireDate;//入职时间
        public void sleep(){
            super.sleep();
            System.out.println("等下还要忙工作呢！");                    
        }
    }
/*
    缺点：发现teacher，student与employee中的代码
*/