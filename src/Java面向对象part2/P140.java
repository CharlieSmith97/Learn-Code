
package Java面向对象part2;

public class P140 {
    public static void main(String[]args){
        person1 p=new person1("小明",20);
        System.out.println(p.speak());
    }
}
    class person1{
        String name;
        int age;
        public person1(){
            
        }
        public person1(String name){
            this(name,0);//因为参数多的构造器（方法）考虑的因素更多功能更强大所以根据合理性 所以由少的构造方法调用多的构造方法
        }
        public person1(String name,int age){
            this.name=name;
            this.age=age;
        }
        /*
        public person1(String name,int age){
            注释：由于代码重复的书写会使维护性低下 this.name=name;
            this(name);//调用上面的构造器  person1（name）一般方法啊 就是类名（参数名称）
            this.age=age;
        }*/
        public String speak(){
            return "姓名："+name+"\t年龄："+age;
        }
    }
        /*
        注释：   其中利用this的方法 
            问题的存在：
                1：代码重复 this.name=name;
                2：重复会导致代码的维护性低下，维护性低。
                 构造器中写重载构造器只能写一次
        */