//子类的初始化过程：穿件子类对象的过程
package Java面向对象part3;

public class P150 {
    public static void main(String[]args){
        fish f1=new fish("阿拉", 8, "黄色");
        f1.say();
    }
}
class animal{
     private String name;
     private int age;
     public animal(String name,int age){
     this.name=name;
     this.age=age;
}
     public String getName(){
         return name;
     }//因为这设置的值是私有的不能直接体现出来不能直接通过set方法体现出来 所以只能通过get方法将他暴露出来
     public int getAge(){
         return age;
     }
}      

 class fish extends animal{
    private String color;
    public fish(String name,int age,String color){
        super(name,age);//调用父类构造器 并且所对应的类型
        this.color=color;
         /*
        super();如果之前父类的构造器为private私有的话则不能继承该构造器 
        但是可以用super（"xxxxx")  是调用父类带有string类型的构造器
        */         
     } 
        public void say(){
            System.out.println("姓名："+super.getName()+"\n年龄："+super.getAge()+"\n颜色："+this.color);
        }
        /*
           say方法中 输出的话中其中姓名，年龄都是通过super调用父类的构造器方法 在调用里面的get方法 而本身的类中则是调用自己的方法 
        */
 }