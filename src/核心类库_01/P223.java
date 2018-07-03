//实现日期格式化和解析工具方法
package 核心类库_01;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import com.sun.xml.internal.ws.util.StringUtil;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class P223 {
    public static final String default_date_pattern = "yyyy-MM-dd HH:mm:ss";
    private P223() {

    }
    public static void main(String[] args) {
        System.out.println(DateTOString(new Date(), "yyyy-MM-dd HH:mm:ss"));
        System.out.println(DateTOString(new Date(), "yyyy-MM-dd HH:mm:ss"));
        System.out.println(DateTOString(new Date(), "yyyy-MM-dd"));
        System.out.println(DateTOString(new Date(), null));
        System.out.println(DateTOString(new Date()));
    }
    public static String DateTOString(Date date) {
        return DateTOString(date, null);
    }
    //格式化操作 Date转换为String    
    public static String DateTOString(Date date, String pattern) {
        SimpleDateFormat S = new SimpleDateFormat();
        //if(StringUtil.hasLength(pattern)){S.applyPattern(pattern);}
        if (StringUtil.isBlank(pattern)) {
            pattern = "default_date_pattern";
        }
        return S.format(date);
    }  
        //解析操作  String转换为Date类型
     public static Date StringToString(String date)throws ParseException{
        return StringToString(date,null);
     }
    public static Date StringToString(String date,String pattern)throws ParseException{
        SimpleDateFormat S=new SimpleDateFormat();
        if(StringUtil.isBlank(pattern)){
            pattern="default_date_pattern";
        }
        return S.parse(date);
    }
}
