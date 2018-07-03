// 日期：2017年3月21日
//要求： 让嵌套语句有规律的输出  每隔五个输出  或者输出以五为倍数的数 
package wangyiyunDemo;

public class Demo2 {
    public static void main(String[]args){
                int  result =0;
              for(int i=1;i<100;i++){
                  if(i%3==0){
                      System.out.print(i+"\t");
                      result++;
                  }//注释：  每输出一组数不换行输出 print 
             if(result%5==0){
             System.out.println();
                  }
              }//注释：设置一个记录变量result  初始化为0 但result%5==0的时候则换行
    }
}
