package com.chb.main;

class JuiceType{
    enum JuiceTypeSize{small,medium,large}
    JuiceTypeSize size;
}
public class MeiJu {
    public static void main(String[] args) {
        JuiceType juiceType=new JuiceType();
        //枚举属于类
        juiceType.size=JuiceType.JuiceTypeSize.large;
        System.out.println(juiceType.size);
    }
}
