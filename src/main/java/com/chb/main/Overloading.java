package com.chb.main;

public class Overloading {
    public static void test(){
        System.out.println("test()");
    }
    public static  void test(int x){
        System.out.println("test(int x)");
    }
    public static void test(int x,String y){
        System.out.println("test(int x,String y)");
    }
    public static void test(String y,int x){
        System.out.println("test(String y,int x)");
    }

    public static void main(String[] args) {
        Overloading.test();
        Overloading.test(1);
        Overloading.test(1,"1");
        Overloading.test("1",1);
    }
}
