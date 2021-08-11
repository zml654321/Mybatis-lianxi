package com.chb.main;

public class StringDemo {
    public static void main(String args[]){
        char[] helloArray = { 'r', 'u', 'n', 'o', 'o', 'b'};
        String helloString = new String(helloArray);
        System.out.println( helloString );
        String site="www.baidu.com";
        int len=site.length();
        System.out.println(len);
    }
}
