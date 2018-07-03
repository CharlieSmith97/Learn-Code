
package Java语言基础part4;

public interface P94 {
   public static void main(String[]args){
       
   }   
      public static void printArry(int []arr){
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
