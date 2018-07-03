// BigDecimal算数类的简介
package Java基本工具;

import java.math.BigDecimal;

public class P208_01 {
    public static void main(String[] args) {
        //以后用BIgDecimal传入字的时候 字符串需要用双引号引起来  因为本身做计算的时候精确度就非常高         
        BigDecimal num1=new BigDecimal("0.09");
        BigDecimal num2=new BigDecimal("0.01");
        System.out.println("两数之和为："+"\n"+num1.add(num2));            
    }
}
