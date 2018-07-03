//枚举的定义特点以及底层分析
package Java面向对象part5;

public class P188 {
    public static void main(String[] args) {
        Employee1 ee=new Employee1();
        ee.setRestDay(WeekDay1.SaturDay);
        //WeekDay1中的 设置的值就是ee对象所获取的值
        WeekDay1 restday=ee.getRestDay();
        //restday作为swuth的首要条件
        switch(restday){
        case  Monday:
                System.out.println("今天星期一！");
            break;
            case  Tuesday:
                System.out.println("今天星期二！");
            break;
            case WednesDay:
                System.out.println("今天星期三！");
            break;   
            case ThursDay:
                System.out.println("今天星期四！");
            break; 
            case FriDay:
                System.out.println("今天星期五！");
            break; 
            case SaturDay:
                System.out.println("今天星期六！");
            break; 
            case SunDay:
                System.out.println("今天星期天！");
            break;             
            default:
         System.out.println("周末不放假！");
        }
        System.out.println("----------------计算中！-----------------");
        if(restday==WeekDay1.SaturDay||restday==WeekDay1.SunDay){
            System.out.println("周末休息！");
        }else{
            System.out.println("周一至周五不休息!");
        }
        System.out.println(ee.getRestDay());//打印出对象的tostring值 然而打印的并非是哈希码值，而是enum中的名称（enmum对tostring做了覆盖）
        System.out.println(ee.getRestDay().name());//打印出枚举对象的常量名称
        System.out.println(ee.getRestDay().ordinal());//打印出序列号  
        
    }
}
class Employee1{
        private WeekDay1 restday;//一周的哪一天休息
        public WeekDay1 getRestDay(){
            return restday;
        }
        public void setRestDay(WeekDay1 restday){
            this.restday=restday;
        }
 }
    //枚举是从Java5开始提供的新的数据类型，是一种特殊的类。就是多个常量对象的集合。	
    enum WeekDay1{
        Monday,Tuesday,WednesDay,ThursDay,FriDay,SaturDay,SunDay;
    }
