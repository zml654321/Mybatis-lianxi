package com.chb.main;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int i=0;
        float f=0.0f;
        System.out.println("输入整数：");
        if(scan.hasNextInt()){
            i=scan.nextInt();
            System.out.println("输入整数为："+i);
        }else {
            System.out.println("输入数据不为整数！");
        }
        System.out.println("输入小数：");
        if(scan.hasNextFloat()){
            f=scan.nextFloat();
            System.out.println("输入小数为："+f);
        }else {
            System.out.println("输入数据不为小数！");
        }
        scan.close();
    }
}
