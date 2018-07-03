//按格式打印数组元素
package Java语言基础part4;

public interface P93 {
    public static void main(String[]args){
        String [] arr={"A","B","C","D","E"};
        P93.printArry(arr);
        
    }
      //按照数组长度打印相对应的元素数组
   public static void printArry(String[]arr){
       String ret="[";
       for(int index=0;index<arr.length;index++){
           ret=ret+arr[index];
           if(index !=arr.length-1){
               ret=ret+",";
           }
       }
       ret=ret+"]";
       System.out.println(ret);
   }
}
  