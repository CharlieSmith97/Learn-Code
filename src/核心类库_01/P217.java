/*
    注意：不能直接给StringBuilder赋值  而是先复制给String newString（String str）.StringBuilder类里面的方法进行设置
*/
package 核心类库_01;

public class P217 {
    public static void main(String[] args) {
      StringBuilder s2=new StringBuilder(16);//里面存储的字符容量为16位
      s2.append("A");
      s2.append("B");
      /*
        附加String参数的字符，以便String参数的长度增加此序列的长度。 如果str是null ，则附加四个字符"null" 。 
      */
        //s2.append("A").append("B");链式编程      
        System.out.println(s2);
       new  P217().ooxx().ooxx();//链式编程
       String str="ABCDEFG";//创建一个String字符串的str 但是里面没有相对应的方法对str数值作删除的方法 
       String NewString=new StringBuilder(str).deleteCharAt((str.length()-1)).toString();
    //将String类型的str转为StringBuilder再调用StringBuilder中的deleteCharAt指定删除方法 加toString方法转为字符串类型的字符串数组
        System.out.println(NewString);
        System.out.println(new StringBuilder(NewString).reverse());//字符反向输出
    }
    public P217 ooxx(){
        return this;
    }
}
