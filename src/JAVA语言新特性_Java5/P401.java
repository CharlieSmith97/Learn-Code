package JAVA语言新特性_Java5;
//Java5-String类的工具类-StringUtil
public class P401 {
    public static void main(String[] args) {
        String str=P401_01.Join("-","A","B","C","D","E");
        System.out.println("最后的拼接结果为："+str);
    }
}
    /*
        因为要做这种操作的话要实现知道多少个字符的操作，要提前准备好StringBuilder的扩容！ 但是扩容和Copy是十分损耗性能的
    */
