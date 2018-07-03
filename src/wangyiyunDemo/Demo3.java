// 日期：2017年3月21日
//要求：求输出一个直角三角形  利用循环嵌套的方式
package wangyiyunDemo;
   
public class Demo3 {
    public static void main(String[]args){
         for(int j=1;j<=5;j++){
             for(int i=1;i<=j;i++){
               System.out.print("*");
             }
             System.out.println();
         }
         /*
         //详解： 像这种随着行数的递增 列数也会和行数一样的话  之前外层与内层boolean表达式的判断中一定要加等于  不然内层的列数少一  
         外层的层数也会随机减少
         */
         System.out.println("---------------------------------------------------");//一条分割线  
         System.out.println("改变boolean之间的大小关系的时候输出结果：");
          for(int a=1;a<5;a++){
              for(int b=1;b<a;b++){
                  System.out.print("&");
              }
              System.out.println();
          }
    }
}
