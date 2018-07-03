//日期格式化 DateFormat-SimpleDateFormat
package 核心类库_01;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class P221 {
    //抛出一个日期异常：从给定字符串的开始解析文本以生成日期。 该方法可能不会使用给定字符串的整个文本。 
    public static void main(String[] args) throws ParseException {
        Date d=new Date();
        System.out.println(d);//Thu May 25 13:45:49 CST 2017
        //格式化操作 Date类型------>String类型
        DateFormat df=DateFormat.getInstance();//短风格时间表示模式  默认是 Short风格
        System.out.println("--------------------------------------");
        String time=df.format(d);
        System.out.println(time);//17-5-25 下午1:45
        System.out.println("--------------------------------------");
        df=DateFormat.getDateInstance(DateFormat.LONG);//长风格的时间表示方式  这边修改的话可以改为long 长风格
        System.out.println(df.format(d));//2017年5月25日
        System.out.println("--------------------------------------");
        df=DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);//长风格的时间表示方式  这边修改的话可以改为long 长风格
        System.out.println(df.format(d));
        System.out.println("--------------------------------------");
        //解析操作：String类型时间------>类型
        df=DateFormat.getInstance();
        time=df.format(d);
        Date d2=df.parse(time);
        System.out.println(d2);
    }
}
