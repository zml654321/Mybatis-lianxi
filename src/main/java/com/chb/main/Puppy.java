package com.chb.main;

public class Puppy {
    int puppyAge;
    public Puppy(){}
    public Puppy(String name){
        //这是一个构造器，仅有一个参数：name
        System.out.println("小狗的名字是："+name);
    }
    public void setAge(int age){
        puppyAge=age;
    }
    public int  getAge(){
        System.out.println("小狗的年龄为："+puppyAge);
        return puppyAge;
    }
    public static void main(String[] args) {
        //生命一个对象
        Puppy myPuppy;
        //初始化和实例化
        myPuppy=new Puppy("tommy");
        myPuppy.setAge(2);
        System.out.println("小狗的年龄为："+myPuppy.getAge());
        System.out.println("小狗的年龄为："+myPuppy.puppyAge);
    }
}
