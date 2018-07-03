package JAVA语言新特性_Java5;

/*
    枚举的实现细节：
    对元素类型选择的限定！
    public enum P406_02 {
    Mon,Tue,Wen,Thu,Fri,Sta,Sun;
    }
    
    判定方法！
    public class P406_01 {
        public static void main(String[] args) {
            P406_03 p1=new P406_03();
            p1.setRestDay(P406_02.Fri);
            System.out.println(p1.getRestDay());
            if (p1.getRestDay()==P406_02.Sta||p1.getRestDay()==P406_02.Sun) {
                System.out.println("放假时间到了！");
            }else{
                System.out.println("周一至周五上班时间！");
            }
        }
    }
    
    构造方法！
    public class P406_03 {
    private P406_02 restDay;
    public P406_02 getRestDay() {
        return restDay;
    }
    public void setRestDay(P406_02 restDay) {
        this.restDay = restDay;
    }
    }
*/