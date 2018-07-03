//选择排序 在方法调用中都是静态方法被主方法调用的方式调用
package Java语言基础part5;

public interface P107 {
    public static void main(String[]args){
        int []arr={2,9,6,4,7,1};
        printArry(arr);
        selectionSort(arr);
        printArry(arr);
    }
    //设定交换的条件方法   
    public static void selectionSort(int [] arr){
          for(int time=1;time<=arr.length-1;time++){
          for(int i=time;i<=arr.length-1;i++){
                if(arr[time-1]>arr[i])
                {
                    swap(arr,time-1,i);
                }
             }
       }         
    }  
    
      //设置一个交换的方法 
      public static void swap(int []arr,int index1,int index2){
       int temp=arr[index1];
       arr[index1]=arr[index2];
       arr[index2]=temp;
        }    
       //注释：按照数组格式输出 
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
