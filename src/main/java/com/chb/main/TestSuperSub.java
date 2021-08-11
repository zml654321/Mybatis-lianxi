package com.chb.main;
class father{
    father(){
        System.out.println("父类无参构造");
    }
    father(int s){
        System.out.println("父类有参构造");
    }
}
class son1 extends father{
    son1(){

    }
    son1(int s){
        /*super(s);*/
    }
}
public class TestSuperSub {
    public static void main(String[] args) {
        son1 son=new son1(1);

    }

}
