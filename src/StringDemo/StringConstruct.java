package StringDemo;

import java.io.UnsupportedEncodingException;

public class StringConstruct {
    public static void main(String[] args) {
        byte[] b1={97,98,99};
        //构造1：字节参数
        String s1 = new String(b1);
        System.out.println(s1);

        //构造2：指定字节数
        byte[] b2={97,98,99};
        String s2=new String(b2,2,1);
        System.out.println(s2);

        //构造3：将字节型数据转换为字符集输出的构造器
        byte[] b3={97,98,99};
        String s3=new String(b3,2,1);
        System.out.println(s3);

        //构造4：字符数组构造
        char[] c4={'w','e','l','e','c'};
        String str4=new String(c4);
        System.out.println(str4);

        //构造5：字符数组构造
        char[] c5={'w','e','l','e','c'};
        String str5=new String(c5,2,3);
        System.out.println(str5);

        //构造6：字节型数据转换为字符集输出
        byte[] b6={97,98,99};
        try {
            String s6 = new String(b2, 2, 1, "utf-8");  //字符集有iso-8859-1 utf-16 us-assii utf-16be等
            System.out.println(s6);
        }catch (UnsupportedEncodingException ex){

        }
    }
}
