package DataTypeAndOperators;
/*
异或 相同为0，不同为1
 */
public class XorDemo {
    public static void main(String[] args) {
        int a=15;  //1111
        int b=2;   //0010
        System.out.println("a与b的异或结果为："+(a^b));
    }
}
//结果为 1101  十进制数为13