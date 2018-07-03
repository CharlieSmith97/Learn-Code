//异常体系 Error（错误）与Exception（异常）
package 语言核心;

public class P228 {
    public static void main(String[] args) {
        System.out.println("Begin................");
        /*
        int []arr=null;
        System.out.println("该数组的长度为："+arr.length());
        */
        int []arr1=new int[]{1,2,3,4};
        //java.lang.RuntimeException 指的是空指针 空引用异常
        System.out.println("数组arr哈希码值为："+arr1.hashCode());
        System.out.println(arr1[1]);//索引的是根据数组下标来索引的
        //java.lang.ArrayIndexOutOfBoundsException: -1 数组索引越界
        System.out.println("Ending................");
        /*
            Integer I1=Integer.valueOf("175s");
            java.lang.NumberFormatException
            For input string: "175s"  来来字传入字符数组中的 “175S”
            抛出以表示应用程序已尝试将字符串转换为其中一个数字类型，但该字符串不具有相应的格式。 
        */
        Integer I1=Integer.valueOf("175");//将字符串数组转数字
        System.out.println(I1);
    }
}
    /**
     * 当空指针异常时后面的语句全部都会停止
     * Begin................
    Exception in thread "main" java.lang.RuntimeException: Uncompilable source code - Erroneous tree type: <any>
    * 翻译结果：在线程“main”java.lang中异常。RuntimeException:不可编译的源代码——错误的树
    at 语言核心.P228.main(P228.java:8)
    C:\Users\甘柳\AppData\Local\NetBeans\Cache\8.2\executor-snippets\run.xml:53: Java returned: 1
    构建失败 (总时间: 0 秒)
     */