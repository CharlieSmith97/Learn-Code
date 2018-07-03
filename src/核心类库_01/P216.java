    //String以及StringBuilder和StringBuffer的区别：
    //用String，StringBuilder，StringBuffer来拼接三万次字符串，对比各自损耗的时间。
package 核心类库_01;

public class P216 {
    public static void main(String[] args) {
        testString();
        testStringBuilder();        
        testStringBuffer();
    }
    private static void testString(){
        String str="";
       long Begin=System.currentTimeMillis();
       for(int i=0;i<30000;i++){
           str+=i;
       }
       long End=System.currentTimeMillis();
       System.out.println("总共耗时："+(End-Begin)+"毫秒！");
    }
    private static void testStringBuilder(){
        StringBuilder str1=new StringBuilder("");
        long Begin=System.currentTimeMillis();
        for(int i=0;i<30000;i++){
           str1.append(i);
       }
        long End=System.currentTimeMillis();
        System.out.println("总共耗时："+(End-Begin)+"毫秒！");
    }
    private static void testStringBuffer(){
        StringBuffer str2=new StringBuffer("");
        long Begin=System.currentTimeMillis();
        for(int i=0;i<30000;i++){
           str2.append(i);
       }
        long End=System.currentTimeMillis();
        System.out.println("总共耗时："+(End-Begin)+"毫秒！");
    }   
}
    /**
     *  经过测试：
     *  String做字符串拼接的时候，性能极低（耗时）,原因是String是不可变的，每次内容改变都会在内存中创建新的对象。
     *  以后再做字符串拼接的时候，不再使用String做运算了，太消耗时间了。
        run:
        总共耗时：1833毫秒！
        总共耗时：0毫秒！
        总共耗时：0毫秒！
        成功构建 (总时间: 2 秒)
     */