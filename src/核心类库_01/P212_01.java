//String面试题_02
package 核心类库_01;

public class P212_01 {
    public static void main(String[] args) {
        String  Str1="ABCD";
        String  Str2="A"+"B"+"C"+"D";
        String  Str3="AB"+"CD";
        String  Str4=new String("ABCD");
        String temp="AB";
        String  Str5=temp+"CD";
        String Str6=getXX()+"CD";
        System.out.println(Str1==Str2);
        System.out.println(Str1==Str3);
        System.out.println(Str1==Str4);
        System.out.println(Str1==Str5);
        System.out.println(Str1==Str6);
    }
    private static String getXX(){
        return "AB";
    }
}   
    /** 输出结果如下：
     *  run:
        true
        true
        false
        false
        false
        成功构建 (总时间: 0 秒)
        "ABCD"
        "ABCD"
        "ABCD"
        new String("ABCD")
        "AB";
         new StringBuilder(String.valueOf(temp())).append("CD").toString();
         new StringBuilder(String.valueOf(getXX())).append("CD").toString();
     */
