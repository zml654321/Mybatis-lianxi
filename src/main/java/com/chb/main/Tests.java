package com.chb.main;

abstract class Animalss{
    abstract void eat();
}
class Cat extends Animalss{
public void eat(){
    System.out.println("吃鱼");
}
public void work(){
    System.out.println("抓老鼠");
}
}
class Dogss extends Animalss{
    public void eat(){
        System.out.println("吃骨头");
    }
    public void work(){
        System.out.println("看家");
    }
}
public class Tests {
    public static void show(Animalss a){
        a.eat();
        if(a instanceof Cat){
            Cat c=(Cat)a;
            c.work();
        }else if(a instanceof Dogss){
            Dogss d=(Dogss)a;
            d.work();
        }
    }
    public static void main(String[] args) {
        show(new Dogss());
        show(new Cat());
        Animalss a=new Cat();
        a.eat();
        Cat c=(Cat)a;
        c.work();
    }
}
