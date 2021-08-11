package com.chb.main;

public class TestArray {
    public static void main(String[] args) {
        /*int size=10;
        double [] number=new double[size];
        number[0]=5.6;
        number[1]=8.1;
        number[2]=0.6;
        number[3]=5.2;
        number[4]=6.6;
        number[5]=7.8;
        number[6]=2.3;
        number[7]=2.6;
        number[8]=9.9;
        number[9]=10.6;
        double total=0;
        for(int i=0;i<number.length;i++){
            total+=number[i];
        }

        System.out.println("和为："+total);*/
        //打印
        double[] numbers = {1.2, 2.3, 5.6, 9.6, 44.2, 105.5};
       /* for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        //求和
        double total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        System.out.println("和为：" + total);
        //最大值
        double max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("最大值为："+max);
        */
        for (double a:numbers){
            System.out.println(a);
        }
    }
}
