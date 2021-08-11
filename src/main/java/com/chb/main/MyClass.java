package com.chb.main;
enum Color{
    red,green,blue;
}
public class MyClass {
    public static void main(String[] args) {
        /*for(Color myVar:Color.values()){
            System.out.println(myVar);
        }*/
        Color myVar=Color.blue;
        switch (myVar){
            case red:
                System.out.println("红色");
                break;
            case green:
                System.out.println("绿色");
                break;
            case blue:
                System.out.println("蓝色");
                break;
        }
    }
}
