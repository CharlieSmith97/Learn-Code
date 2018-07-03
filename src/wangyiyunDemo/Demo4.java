// 日期：2017年3月21日
//continue的使用 直接可以设置条件来调用continue来跳过不想要的数/对象
package wangyiyunDemo;

public class Demo4 {
   public static void main(String[]args){
       int result=0; 
       for(int i=1;i<=100;i++){
           if(i%4==0){
               continue;
           }
           System.out.print(i+"\t");//加一个table键位  让每个数都有序的隔开
            result++;
           if(result%10==0){
           System.out.println(); //注释： 没过10个数的话 直接回车换行！
        }
       }
       System.out.println("END.......................");
   } 
}
