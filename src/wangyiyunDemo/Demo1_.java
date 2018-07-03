 //日期：2017年3月21日 
package wangyiyunDemo;

public class Demo1_ {
    public static void main(String[]args){
   System.out.println("----------------------------------------------");
       for(int a=1;a<=9;a++){
           for(int b=1;b<=a;b++){
               if(a==5){
                   break;
                   /*
                     注释：break也会结束当前的循环但是不会结束后面语句的循环 如图所示
                   */      
               }
               System.out.print(a+"*"+b+"="+(a*b)+"\t");
           }
           System.out.println();
       }
    }
}
