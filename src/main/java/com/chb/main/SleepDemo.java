package com.chb.main;

import java.util.Calendar;
import java.util.Date;

public class SleepDemo {
    public static void main(String[] args) throws InterruptedException {
       /* System.out.println(new Date());
        long start=System.currentTimeMillis();
        Thread.sleep(3000);
        long end=System.currentTimeMillis();
        long diff=end-start;
        System.out.println(new Date());
        System.out.println(diff);*/
        Calendar c1=Calendar.getInstance();
        int year=c1.get(Calendar.YEAR);
        System.out.println("年："+year);
        int month=c1.get(Calendar.MONTH)+1;
        System.out.println("月："+month);
        int date=c1.get(Calendar.DATE);
        System.out.println("日："+date);
        int hour=c1.get(Calendar.HOUR_OF_DAY);
        System.out.println("时："+hour);
        int minute=c1.get(Calendar.MINUTE);
        System.out.println("分："+minute);
        int second=c1.get(Calendar.SECOND);
        System.out.println("秒："+second);
        int day=c1.get(Calendar.DAY_OF_WEEK);
        System.out.println("星期："+day);

    }
}
