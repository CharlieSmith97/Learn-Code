//组合关系 对一个数组排序   方法可以调用别类当中的
package 组合关系实例;
  //继承之前的工具类  所以可以直接通过对象来调用或者方法点对象的方式来调用此功能
/*
public class CombinationDemo extends ArrayUtil{
        public void test(){
        int []arr={-2,9,1,0,6,8};
        sort(arr);
    } 缺点：这段代码开始时就继承了ArraysUtil的类 
    所以Combination里面会具有不该有的功能 所以为了代码能提现良好的封装性
    有必要对代码进行优化操作
*/ 
     class ComninationDemo{
        private ArrayUtil util=new ArrayUtil();
    public void test(){
      int[] arr={-2,9,1,15,8};
      util.sort(arr);
    }
     public static void main(String[]args){
        new ComninationDemo().test();
    }
}

