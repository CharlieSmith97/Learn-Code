package Java核心类库_IO_part_02;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class P356 {
    public static void main(String[] args) throws IOException {
        //字符串内存流:StringReader-StringWriter
        StringWriter SW=new StringWriter();
        SW.write("犹趁未老时！");
        StringBuffer str=SW.getBuffer();
        //因为StringReader里面只能传入String类型的数据 而之前创建的临时数据存储数组是StringBuffer类型所以只能使用toString类型来转为String类型  
        StringReader SR=new StringReader(str.toString());
        char[] ch=new char[1024];
        int len=-1;
        while((len=SR.read(ch))!=-1){
            System.out.println(new String(ch,0,len));
        }
    }
}
