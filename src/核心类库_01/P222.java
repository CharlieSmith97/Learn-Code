//日历类 Calendar
package 核心类库_01;

import java.util.Calendar;
import java.util.Date;

public class P222 {
    public static void main(String[] args) {
        //创建日历对象
        Calendar c=Calendar.getInstance();
        System.out.println(c);    
        System.out.println("年："+c.get(Calendar.YEAR)+"\n月："+(c.get(Calendar.MONTH)+1)+"\n日："+c.get(Calendar.DAY_OF_MONTH));    
        System.out.println("时"+c.get(Calendar.HOUR_OF_DAY)+"\n分："+c.get(Calendar.MINUTE)+"\n秒："+c.get(Calendar.SECOND));
        System.out.println("--------------------------------------------------");
        //Calendar 转为Date
        Date d=c.getTime();//获取和设置日历字段值 
        //add(int field,int amount)时间偏移 为给定的日历字段 添加或者减去的时间段
        System.out.println("日："+c.get(Calendar.DAY_OF_MONTH));
        c.add(Calendar.DAY_OF_MONTH, -100);//Calendar对象：日 在100天之前的时间
        System.out.println(c.getTime().toLocaleString());//此日期的字符串表示形式，使用区域设置约定。
        /*
        public String toLocaleString() {
            DateFormat formatter = DateFormat.getDateTimeInstance();
            return formatter.format(this);
        }getDateTimeInstance:
        */
    }
}
