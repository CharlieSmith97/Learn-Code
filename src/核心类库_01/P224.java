//常用类 日历操作练习 起止时间的计算
package 核心类库_01;

import java.util.Calendar;
import java.util.Date;

public class P224 {

    public static void main(String[] args) {
        //需求：查询最近一周。。。。。的信息，如何表示最近这一周
        Date current = new java.util.Date();
        //把当前系统时间作为日历的时间 
        Calendar c = Calendar.getInstance();
        /*  
        与其他区域设置敏感的类一样， Calendar提供了一种类方法getInstance ，用于获取此类型的一般有用的对象。
        Calendar的getInstance方法返回一个Calendar对象，其日历字段已使用当前日期和时间进行初始化：     
             Calendar rightNow = Calendar.getInstance();
         */
        c.setTime(current);
        //把获取的时间设置为日历时间
        //把日增加1天，再把时分秒设置为0
        c.add(Calendar.DAY_OF_MONTH, 1);
        c.set(Calendar.HOUR_OF_DAY, 0);//把时间设置为零
        c.set(Calendar.MINUTE, 0);//把分设置为零
        c.set(Calendar.SECOND, 0);//把秒设置为零
        Date endTime = c.getTime(); //结束时间

        c.add(Calendar.DAY_OF_MONTH, -7);//开始时间为结束时间的7天之前
        Date beginTime = c.getTime();//开始时间

        System.out.println("开始时间：" + "\n" + beginTime.toLocaleString());
        System.out.println("结束时间：" + "\n" + endTime.toLocaleString());
    }
}
/*
    setTime()设置此 Date对象以表示1970年1月1日00:00:00 GMT后的 time毫秒的时间点。 
    getTime()返回此 Date对象以表示1970年1月1日00:00:00 GMT后的 time毫秒的时间点。 
*/
