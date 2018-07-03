 //枚举的引入和模拟  再有人创建新的对象给传入的值做一个固定的类，在保证数据安全的同时，也明确相对的业务含义
package Java面向对象part5;

public class P187 {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.setRestDay(WeekDay.Monday);
        //---------------------------------
        WeekDay restday=e1.getRestDay();
      
        if(restday==WeekDay.SaturDay||restday==WeekDay.SunDay){
            System.out.println("周末休息！");
        }else{
            System.out.println("周一至周五休息!");
        }
       
    }
}
 class Employee{
        private WeekDay restday;//一周的哪一天休息
        public WeekDay getRestDay(){
            return restday;
        }
        public void setRestDay(WeekDay restday){
            this.restday=restday;
        }
 }
    /*
        调用代码变成： e1.setRestDay(WeekDay.Monday); 业务含义明确
        此时，业务含义明确，因为weekday.WednsDay就表示周三的意思，
        但是，因为在Employee中的restDay的类型是Int类型，我们依然可以随意设置Int类
        e.restDay(13);
        总的来讲的话还是没有解决数据安全的问题。
    */
 class WeekDay{
     private WeekDay(){
         
     }
     public static final WeekDay Monday=new WeekDay();
     public static final WeekDay Tuesday=new WeekDay();
     public static final WeekDay WednesDay=new WeekDay();
     public static final WeekDay ThursDay=new WeekDay();
     public static final WeekDay FriDay=new WeekDay();
     public static final WeekDay SaturDay=new WeekDay();
     public static final WeekDay SunDay=new WeekDay();        
 }
    /*
        缺点：根据代码段来看没出现什么错误，但是就是在代码执行的过程中，
        所存在的问题是：如果传入的数值为十几或者二十几的话，那么输出的职责永远是在
        星期一和星期五之间了，就缺乏对事物理性的看待，由此在输入值的时候，
        做合理化判断并且给出相应的结果才是代码块最重要的几个关键点！
        
        设计上面存在什么问题？
            问题所在：
                1.使用int类型表示星期几，类型不安全  完全可以设置一个非一到七的数。
                2.业务含义不够明确，设置1表示周几？周一/周日
        ---------------------------解决方案！-----------------------------------
            专门使用WeekDay来表示星期几！
        ------------------------------------------------------------------------
        总结：      
            主要还是因为类型的不安全，里面传入的值可以被改变，也就意味数据的不稳定性，我们把休息日，
            使用一个对象类型来表示，并固定该休息日的值只能是周一到周日，为防止外界创建心得weekday对象。
            此时的调用代码解决了安全问题！  业务也随即明确了！

    */