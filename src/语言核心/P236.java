//自定义异常类
package 语言核心;

import javax.swing.JOptionPane;

public class P236 {  
        //模拟小型数据库 对用户做注册的时候做合理化判断！
    private static String[] users={"Will","lucy","lily","jack"};
    public static void main(String[] args) {
        try {
           checkUserName("naci"); 
            //System.out.println("恭喜你！注册成功！");
            JOptionPane.showMessageDialog(null,"恭喜你！注册成功！");
        } catch(P236_Exception e){
            //e.getMessage();
            System.out.println("给用户看："+e.getMessage());
        }
        catch (Exception e) {
        }
    }
  
    public  static boolean checkUserName(String userName) throws P236_Exception{
        //将users字符串数组遍历 然后一一比较 当不重名的时候直接通过 
        for (String user : users) {
            if(user.equals(users)){
              throw new P236_Exception("该账号名,"+user+",已有人使用！");
            }
        }
        return true;
    }
}
