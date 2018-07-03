
package 组合关系实例;
public class ArrayUtil {
   public void sort(int arr[]){
       for(int times=1;times<=arr.length;times++){
           for(int i=times;i<arr.length-1;i++){
               if(arr[times-1]>arr[i]){
               swap(arr,arr.length-1,i);
           }
           }
       }
   }
   static void swap(int[]arr,int index1,int index2){
       int temp=arr[index1];
       arr[index1]=arr[index2];
       arr[index2]=temp;
       //位置互换  排序
   }
}
