//系统相关类 （System-Runtime）
package Java基本工具;

import java.util.Arrays;

public class P207 {
    /*
        protected void finalize()
                     throws Throwable    
        当垃圾收集确定不再有对该对象的引用时，垃圾收集器在对象上调用该对象。
        一个子类覆盖了处理系统资源或执行其他清理的finalize方法。              
    */    
    @Override
    protected void finalize() throws Throwable{
        super.finalize();
        System.out.println("被回收！");
    }
    public static void main(String[] args) {
    //数组拷贝操作          原数组   从第几个数开始复制    目标数组    从第几个数开始黏贴    黏贴的数量
    //Static void arrcopy(object src,int srcPos,object dest,int destPos,int Length)
    int []src={1,2,3,4,5,6,7,8,9};
    int []arr=new int[10];
        //拷贝前    
        System.out.println(Arrays.toString(arr));
        System.arraycopy(src, 2, arr, 5, 4);
        //拷贝后的输出       
        System.out.println(Arrays.toString(arr));
        System.out.println("现在播报时间！");
        //用来测试某一个操作的损耗时间   System.currentTimeMillis() 获取时间的方法 
        System.out.println(System.currentTimeMillis());
        System.out.println("马上结束！");
        //System.exit(0);//虚拟机结束操作！
        //public static void gc()强制执行垃圾回收器  一般不用   
        //System.gc();如果强制运行成功的话那么就会输出被回收的输出语句！   Runtime.getRuntime().gc(); 底层都是调用了Runtime类的
        /*
           意识：
            当看API的时候，发现没有公共的构造器，但是方法又不是Static修饰的，
            立马要意识到：该类中至少有一个Static方法用于返回当前类对象----->单例模式
        */
        new P207();
        System.out.println("Ending....................");
    }
}
