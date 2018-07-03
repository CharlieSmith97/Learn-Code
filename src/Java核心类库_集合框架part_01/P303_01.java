package Java核心类库_集合框架part_01;

public class P303_01 {

    public static void main(String[] args) {
        //情况1：使用String类型
        Point<String> p1 = new Point<String>();
        String x1 = p1.getX();
        //情况2：使用Integer类型
        Point<Integer> p2 = new Point<Integer>();
        Integer x2 = p2.getX();
        //情况3：使用double类型
    }
    public static <T> T Dowork(T var){
        return var;
    }    
}
