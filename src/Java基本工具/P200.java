//GUI的简单操作  和匿名内部类
/*
  注意： 
	 在变成当中 new 接口名称（）{
		System.out.println("xxxxxx"):
	}
	这不是新建一个接口，而是实现一个匿名内部类
	 从而直接从外部内中调用匿名内部类中的方法。
	
	 *：匿名内部类访问局部变量是需要加final的。
*/
package Java基本工具;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class P200 {
    public static void main(String[] args) {
        JFrame  F=new JFrame("GUI界面");        
        //创建一个文本框
      final  JTextField TF1=new JTextField(20);
        //设置边界式布局 把文本框放入北部      
        F.add(TF1,BorderLayout.NORTH);
        //创建一个按钮        
        JButton btn=new JButton("点我！");
        F.add(btn);//把按钮置放在GUI界面之上
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String info=TF1.getText();
                JOptionPane.showMessageDialog(null,info);
            }
        });
        //对GUI界面的按钮做一个监听的功能
        F.pack();
        F.setVisible(true);
        //对窗口做一个监听的功能 当点击红叉叉的时候，虚拟机关闭随着程序也会被关闭
        F.addWindowListener(new WindowAdapter() {
          public void windowClosing(WindowEvent e){
              System.exit(0);
          }
        });
    }
}
