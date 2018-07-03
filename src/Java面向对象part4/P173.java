//模板方法设计模式
package Java面向对象part4;

public class P173 {
    public static void main(String[]args){
        //统计字符串连接一万次此时和int相加10000次的时间差
        long time=new StringOperate().doWork();
        System.out.println(time);
        System.out.println(new IntOperate().doWork());
    }
}
 class StringOperate{
     public long doWork(){
        long begin=System.currentTimeMillis() ;
         String str="";
         for(int i=0;i<10000;i++){
             System.out.println("连接了："+i+"次");
             str+=1;
         }
         long end=System.currentTimeMillis() ;
         long time=end-begin;
         return time;
     }
 }
 class IntOperate{
     public long doWork(){
        long begin=System.currentTimeMillis() ;
        int sum=0;
         for(int i=0;i<10000;i++){
             System.out.println("相加了："+i+"次");
             sum+=1;
         }
         long end=System.currentTimeMillis() ;
         long time=end-begin;
         return time;
     }
 }
    /*
       中间的运算方式不一样 其余的都一样
    */