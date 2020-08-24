package StringDemo;
//stringbuffer可以空间自增加，可以修改改变内容，构造函数默认16个字符
public class StringBufferDemo {
    public static void main(String[] args) {
        //构造1：默认16个字符
        StringBuffer sb1=new StringBuffer();
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());

        //构造2：指定缓冲区大小

        StringBuffer sb2=new StringBuffer(100);
        System.out.println("容量改之前"+sb2.capacity());
        sb2.ensureCapacity(200);  // 扩容调整至200 但是值为202 不知道这是为什么？？？？
        System.out.println("容量改之后"+sb2.capacity());
        System.out.println(sb2.length()); //存在buffer里面的字符长度

        //指定位置元素赋值
        StringBuffer sb3=new StringBuffer("明是一个优秀程序员");
        sb3.setCharAt(1,'小');
        System.out.println(sb3);

        //指定位置插入值
        StringBuffer sb4=new StringBuffer("明是一个优秀程序员");
        sb4.insert(2,"你的好");
        System.out.println(sb4);
    }
}
