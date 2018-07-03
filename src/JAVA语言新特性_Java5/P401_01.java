package JAVA语言新特性_Java5;
//将字符串相对应的方法封装成为一个工具类 因为都是静态的方法 所以只需要用类名调用就行 不需要创建对象来调用！
public class P401_01 {
    //将构造器私有化起来 为了防止别人创建对象
    private  P401_01() {
    }
    /*
    判断字符串非空
        1.引用为空！ null
        2.字符串为空 “”；
    */
    public static boolean hasLength(String str){
        //判断里面是否有元素 既不等于null也不等于空  两个判断方法都应该取反！
        if (str!=null&&!"".equals(str.trim())) {
            return true;
        }
        return false;
    }
    /*
    public static boolean hasLength(String str){
        //判断里面是否有元素 既不等于null也不等于空  两个判断方法都应该取反！
        return str!=null &&!"".equals(str.trim());
    }
    */
    
    //定义一个方法判断字符串为空
    public static boolean isBlank(String str){
        return !hasLength(str);
    }
    /*
    if( str==null||"".equals(str.trim())){
        return true;
    }
    return false;
    */
    
    //定义一个方法：Join 可以对传入该方法的字段按照指定的分隔符做连接操作，并返回连接好的新的字符串
    public static String Join(String separator,String... value){
        if (isBlank(separator)) {
            separator=",";
        }
        StringBuilder sb=new StringBuilder();
        /*
            让StringBuilder做字符拼接操作（性能比较高）！ 取出每一个字符串做拼接操作
            队最后一个元素进行判断操作 如果是最后一个元素的话那么就可以不用在末尾加上定制的连接符了！
        */ 
        for (int i = 0; i <value.length; i++) {
            sb.append(value[i]);
            if (i!=(value.length)-1) {
                sb.append(separator);
            }
        }
        return sb.toString();
    }
}
