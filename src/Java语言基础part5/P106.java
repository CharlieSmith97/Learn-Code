//注释：冒泡排序法
package Java语言基础part5;

public interface P106 {
    public static void main(String[]args){
        int[]arr={2,9,6,4,7,1};
        printArry(arr);
        bubblesort(arr);
        printArry(arr);
        
    }
    public static void bubblesort(int[]arr){
        for(int time=1;time<=arr.length-1;time++){
            for(int i=1;i<=arr.length-time;i++)
            {
                   if(arr[i-1]>arr[i])
                 {
                   swap(arr,i-1,i);
                 }
            }
        }
    }
   public static void swap(int []arr,int index1,int index2){
       int temp=arr[index1];
       arr[index1]=arr[index2];
       arr[index2]=temp;
   }
   public static void printArry(int []arr){
       String ret="[";
       for(int index=0;index<arr.length;index++){
           ret=ret+arr[index];
           if(index !=arr.length-1)
           {
               ret=ret+",";
           }
       }
       ret=ret+"]";
       System.out.println(ret);
   }
}
