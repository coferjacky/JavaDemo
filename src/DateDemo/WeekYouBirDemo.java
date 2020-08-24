package DateDemo;
/*
给定日期后打印出每年生日所属生日在星期几
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class WeekYouBirDemo {
    public static void main(String[] args) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        final char[] birWeek={'日','一','二','三','四','五','六'};
        for(int i=2007;i<=2020;i++){
            gregorianCalendar.set(i, Calendar.FEBRUARY,20);
            char week=birWeek[gregorianCalendar.get(Calendar.DAY_OF_WEEK)-1];
            System.out.println(i+"年的生日是星期"+week);
        }
    }
}
