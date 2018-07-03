/*
    1.获取以Hellow开头的文件名的后缀名：
    2.把单词首字母大写：
*/
package 核心类库_01;

public class P214 {
    public static void main(String[] args) {
        /*
        sete();
        sete2();
        */
        sete3();
    }

    private static void sete() {
       String fileName="abc.java;Hellow.txt;java;Hellow.java;Hellow.class";
        //以分号来分割字符串，获取每一个文件的文件名以及拓展名
       String []names= fileName.split(";");
        for (String name : names) {
            //System.out.println(name);
            //判断每一个字符串是否以Hellow开头 
            if(name.startsWith("Hellow")){
                //获取文件名的后缀名：最后一个点的后半截                
                System.out.println(name);
               int index= name.lastIndexOf(".");
                System.out.println("点的位置为："+index);
                //截取字符串
             String newname=name.substring(index);
                System.out.println("截取后的字符串为："+newname);
            }
        }
    }
    private static void sete2(){
        String str="willabcdefg";
        String newstr=str.substring(0,1).toUpperCase();
        String newbb=str.substring(1, str.length());
         System.out.println(newstr+newbb);
    }
    //判断字符串为空  1.引用为空  还有一种为字符串  既不等于null也不等于空
    private static void sete3() {
        String st1="";
        String st2=" ";
        String st3=null;
        if(st1!=null&&!"".equals(st1)){
            System.out.println("非空！");
        }else{
            System.out.println("空！");
        }
    }
}

    /**
     * split    //以分号来分割字符串，获取每一个文件的文件名以及拓展名
     *startsWith    //判断每一个字符串是否以Hellow开头
     * lastIndexOf  //获取文件名的后缀名：最后一个点的后半截 36
     * substring  //截取字符串
     */
     /*
     判断不为空，或者为null
     private static boolean haLength(String str){
     return str !=null&&!"".equals(Str.trim());
    }
        &&：如果两边条件都符合的话那就为true 否则为false
     判断为空，或者为null
     private static boolean isblank（String str）{
     return str=null || "".equals(Str.trim());
    优化 return！hasLength（str）;
    } 
     */