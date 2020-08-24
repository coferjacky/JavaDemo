package DateDemo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GreCalendarDemo {
    public static void main(String[] args) {

        GregorianCalendar gc = new GregorianCalendar();
        //返回当前月
        int i = gc.get(Calendar.MONTH);
        System.out.println(i);

        //设定当前日历月并返回设定的年份
        GregorianCalendar gc1 = new GregorianCalendar();
        gc1.set(Calendar.YEAR,2014);
        System.out.println(gc1.YEAR);

        //给定年月日返回对应的年月日
        GregorianCalendar gc2=new GregorianCalendar();
        gc2.set(2013,10,4);
        System.out.println(gc2.get(Calendar.YEAR));
        System.out.println(gc2.get(Calendar.MONTH));
        System.out.println(gc2.get(Calendar.DATE));


    }
}
