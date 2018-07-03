// 日期：2017年3月21日
//要求： 在九九乘法表中 根据条件判断和break与return的方法对外层循环的控制
package wangyiyunDemo;

public class Demo1 {
    public static void main(String[]args){
      for(int line=1;line<=9;line++){
          for(int i=1;i<=line;i++){
              if(line==5)
              {
                return;//注释： 会直接结束当前操作 且后面语句执行的操作也会被直接关闭
              }
              System.out.print(line+"*"+i+"="+(line*i)+"\t");
          }
          System.out.println();
      }
    }
}
