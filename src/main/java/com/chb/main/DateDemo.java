package com.chb.main;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date date=new Date();
        SimpleDateFormat ft=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("当前时间为："+ft.format(date));
    }
}
