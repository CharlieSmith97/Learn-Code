//要求： 通过创建方法在一个数组中求出最大值  可以不用创建新的类被调用从而实现这个功能
package Java语言基础part4;

public class P92 {
     public static void main(String[]args){
         int [] num=new int[]{1,3,5,4,7,10};
          int max=P92.getMax(num);
           // max方法为=类名.方法名（所带参）对方法进行调用从而获取最大值 
          int min=P92.getmin(num);
          System.out.println("本数组中最大的值为："+max);
          // max方法为=类名.方法名（所带参）对方法进行调用从而获取最大值
          System.out.println("数组中最小的值为："+min);
     }

 
      /*
        注释：前面定义的获取最大值的方法定义为静态方法
        不用public  而直接用static静态方法做全局调用
      */
     
    static int  getMax(int num[]){
            int max=0;//假设第一个数位最大值
            for(int index=1;index<num.length;index++){
            if(num[index]>max){
               max=num[index];  //把最大值直接存入max里面进行对比
            }
        }
        return max;
     }  
  
          static int  getmin(int num[]){
            int min=0;//假设第一个数位最大值
            for(int index=1;index<num.length;index++){
            if(num[index]<min){
               min=num[index];  //把最大值直接存入min里面进行对比
            }
        }
        return min;
     }
    
                
  } 