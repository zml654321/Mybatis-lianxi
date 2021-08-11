package com.chb.main;

class Animals{
    public void move(){
        System.out.println("动物可以跑！");
    };
}
class D extends Animals{
    public void move(){
        System.out.println("狗狗可以跑！");
    }
}
public class TestDog {
    public static void main(String[] args) {
        Animals animals=new Animals();
        animals.move();
        Animals d=new D();
        d.move();
    }
}
