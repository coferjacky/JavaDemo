package DataTypeAndOperators;
/*
此处注意a值为  00000000000000000000000000000010 共计32位，但是 非零运算后是111111111111111111111111111111101
首先确定是负数，然后将该数减1 再取反得到一个正数3，然后加负号即可
 */
public class NotOperDemo {
    public static void main(String[] args) {
        int a=6;
        System.out.println("a的非的结果为："+(~a));
    }
}
