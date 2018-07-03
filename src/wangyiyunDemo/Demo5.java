//日期：2017年3月21日
package wangyiyunDemo;

public class Demo5 {
    public static void main(String[]args){
        for(int i=1;i<=5;i++){
            for(int j=1;j<i+1;j++){
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
    }
}
    /*
               *     第一行的时候 列输出1 第二行的时候输出2  只要控制列的输出情况 等到内循环做完一次才跳出内循环做换行
              * *      
             * * *
            * * * *
*/
