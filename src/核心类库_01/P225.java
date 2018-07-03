//正则表达式
package 核心类库_01;

public class P225 {
    public static void main(String[] args) {
        String input="1234312421sb";
        boolean ok=isNumber(input);
        System.out.println("判断后的结果为："+"\n"+ok);
        //matches匹配正则表达式n  "1234124".matches("\\d")如\\d后面什么都不写的话只表示出现一次
        System.out.println("1234124".matches("\\d{5,10}"));
        System.out.println("----------------------");
        input="13767897758";
        String regex="^1[3|4|5|7|8]\\d{9}$";
        System.out.println(input.matches(regex));
    }
    //案例：判断一个字符串全部由数字组成    
    private static boolean isNumber(String str){
    //将String字符串分割为char数组然后对char数组里面的字段进行判断 并且利用foreach遍历 挨个判断里面的值    
        char [] arr=str.toCharArray();
    //将char数组里面的值全部遍历列举一遍        
        for (char c : arr) {
           if(c<'0'||c>'9'){
               return false;
           }    
        }
        return true; 
    }
}
