
package java面对对象;

public class import关键字 {
    public static void main(String[]args){
         int[] arr=new int[]{11,-2,3,-4,6,7};
         //打印数组
         String ret=java.util.Arrays.toString(arr);
         //没排序之前
         System.out.println(ret);
         //排序  
         java.util.Arrays.sort(arr);
         //打印数组
         ret=java.util.Arrays.toString(arr);
         //输出数组  排序之后
         System.out.println(ret);
    }
}
