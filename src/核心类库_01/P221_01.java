
package 核心类库_01;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class P221_01 {
    public static void main(String[] args) throws ParseException {
        //自定义日期的模式
       String  pattern="yyyy-MM-dd HH:mm:ss E";
       /*
            SimpleDateFormat是一个具体的类，用于以区域设置敏感的方式格式化和解析日期。 
            它允许格式化（日期文本），解析（文本日期）和归一化。
       */
        SimpleDateFormat sdf=new SimpleDateFormat();
        //申请使用哪一种时间模式 将给定的模式字符串应用于此日期格式
        sdf.applyPattern(pattern);
        //格式化 将一个Date转String 
        String time1=sdf.format(new java.util.Date());
        System.out.println(time1);
        //解析,是用什么风格格式化的，必须需要使用相同的字符解析回去 将一个String转Date
        java.util.Date d=sdf.parse(time1);//parse：从字符串中解析文本以产生一个 Date 。 
        System.out.println(d);
    }
}
