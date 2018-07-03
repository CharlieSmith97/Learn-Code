// this简单实例 加了相关的继承知识
package Java面向对象part2;

public class P137 {
    public static void main(String[]args){
        student st1=new student("小明",19,"五道口职业技术学院");
        //System.out.println("名字："+p1.getName()+"\t年龄："+p1.getAge());
        System.out.println(st1.show());
    }
}
  class person{
      private String name;
      private int age;

       //把调用者传递的name参数的值赋值给name字段     
      public person(String name,int age){
          this.name=name;
          this.age=age;
      }
      public String getName(){
          return name;
      }
      public int getAge(){
          return age;
      }
      public String show(){
          return "我的姓名："+name+",年龄："+age;
          //返回一个数值 但是没有打印出来
      }
  }
 class student extends person{
     private String school;
     public student(String name,int age,String school){
         super(name,age);
         this.school=school;
     }
     public String show(){
         return "姓名："+super.getName()+"\n年龄："+super.getAge()+"\n学校："+this.school;
         //复写 ： return "姓名："+this.getName+"\t年龄："+this.getAge+"\t学校："+this.getSchool;
     }
 }