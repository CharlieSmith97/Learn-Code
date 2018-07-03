package JAVA语言新特性_Java8;
//Java8中的lambda表达式语法-参数列表

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class P412 {
    public static void main(String[] args) {
        new P412();
        new P412().test1(); 
    }
    public P412() {
        new Thread(()->System.out.println("你好啊线程!")).start();
    }
    public void  JF(){
        JFrame j=new JFrame("My windows");
        j.setSize(100,100);
        JButton bt=new JButton("Enter lambda");
        j.add(bt);
        /*
        当参数列表只有一个参数的时候 对于参数列表有两种解决方案
        1.如果加了参数类型的话 那么就得加一个括号 如果没有参数类型的话那么就直接将两个参数传入其中！
        */
        bt.addActionListener(event -> JOptionPane.showMessageDialog(null,"点我啊！"));
        j.setVisible(true);
    }
    public void test1(){
        String [] s1=new String[]{"AJ","qiaozhi","dongyeguiwu","shanye"};
        Arrays.sort(s1,(a1,a2)->Integer.compare(a1.length(),a2.length()));
        System.out.println(Arrays.toString(s1));
    }
}
