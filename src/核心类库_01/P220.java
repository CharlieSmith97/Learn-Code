/*
  日期类Dates
  需求：定义一个类，使用一个字段来表示年龄，在系统中存储每个人的员工的基本信息，
        包括了员工的年龄，此时使用Integer/int表示年龄是不合理的。
        如何计算一个员工的入职年龄（功能）
*/
package 核心类库_01;

public class P220 {
    public static void main(String[] args) {
        java.util.Date date=new java.util.Date();
        System.out.println(date);
        //long---->Date对象        
        long time=System.currentTimeMillis();
        date=new java.util.Date(time);
        System.out.println(date);   
        //Date对象----->long
        System.out.println(date.getTime());//返回自1970年1月1日0:00:00 GHT以来次Date对象表示的毫秒数
        System.out.println("中国时间："+date.toLocaleString());
    }
}
