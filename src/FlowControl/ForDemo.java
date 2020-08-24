package FlowControl;
//增强形for语句  主要用于迭代集合的
// for (type 变量名：集合变量名)
public class ForDemo {
    public static void main(String[] args) {


        int[] arr={1,2,3,4,5,6};
        System.out.println(add(arr));
    }
    public static int add(int... xs){
        int sum=0;
        for(int x:xs){
            sum=sum+x;
        }
        return sum;

    }
}
