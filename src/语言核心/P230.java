//获取和查看异常信息
package 语言核心;

public class P230 {
    public static void main(String[] args) {
        try {
            int []arr=new int[]{1,23,123,3244};
            System.out.println("对数组的索引:"+"\n"+arr[-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
          //System.out.println(e.getMessage()); java.lang.ArrayIndexOutOfBoundsException: -1 可以直接通过e.getMessage()输出出错的地方！
            System.out.println("数组索引越界！"+e.toString());
            //e.toString() 返回此可抛出的简短描述。 
            System.exit(0);//直接捕获异常之后可以自定义选择关闭JVM
        }
        catch (Exception e) {
            System.out.println("出现未知错误！很抱歉！"+e.toString());
            /*
            e.printStackTrace();
            e.printStackTrace("提示语句！");
            e.printStackTrace("提示字段！");
            */
        }finally{
            System.out.println("欢迎本次使用！");
        }
    }
}
    /*
      try{
      }
    catch(Exception e){
        sout(""+e.getMessage());
        sout(""+e.toString());
        printStackTrace();
       }
     */