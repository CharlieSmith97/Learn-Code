package Java核心类库_集合框架part_01;

import java.util.ArrayList;
import java.util.List;

/*
    泛型的运用：
 */
public class P303 {

    public static void main(String[] args) {

    }
}

/*
 {
    List ls=new ArrayList();
    ls.add(1);//Integer类型
    Object ele=ls.get(0);
    //现在需要调用Integer中的方法
    Integer num=(Integer) ele;//将ele强转为Integer类型！
    System.out.println(num);
  }
 */
class Point<T>{
    private T x;
    private T y;
    public T getX() {
        return x;
    }
    public T getY() {
        return y;
    }
    public void setX(T x) {
        this.x = x;
    }
    public void setY(T y) {
        this.y = y;
    }
}
