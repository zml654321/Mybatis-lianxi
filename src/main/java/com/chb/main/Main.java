package com.chb.main;
class Animal{
    void eat(){
        System.out.println("animal:eat");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("dog:eat");
    }
    void eatTest(){
        this.eat();//this调用自己的方法
        super.eat();//super调用父类方法,上一父类
    }
}
class JMDog extends Dog {
    void eat(){
        System.out.println("JM:eat");
    }
    void eatTest(){
        this.eat();
        super.eat();
    }
}
public class Main {
    public static void main(String[] args){
       /* Animal a=new Animal();
        a.eat();
        Dog d=new Dog();
        d.eat();
        d.eatTest();*/
        JMDog jmDog=new JMDog();
        jmDog.eat();
        jmDog.eatTest();
    }
}
