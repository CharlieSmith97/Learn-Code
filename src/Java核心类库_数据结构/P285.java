package Java核心类库_数据结构;

public class P285 {
    public static void main(String[] args) {
        P284 p1=new P284();
        p1.addLast("b");
        System.out.println(p1);
        p1.addLast("c");
        p1.addLast("d");
        System.out.println(p1);
        
        p1.remove("c");
        System.out.println(p1);
    }
}
