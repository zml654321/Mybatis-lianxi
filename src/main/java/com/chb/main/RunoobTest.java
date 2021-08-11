package com.chb.main;

import java.util.*;

public class RunoobTest {
    public static void main(String[] args) {

        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("google");
        arrayList.add("runoob");
        arrayList.add("taobao");
        arrayList.add("zhihu");
        Iterator<String> it=arrayList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


       /* HashMap<Integer,String> hashMap=new HashMap<Integer, String>();
        hashMap.put(1,"Google");
        hashMap.put(2,"taobao");
        hashMap.put(3,"zhihu");
        System.out.println(hashMap);
        System.out.println(hashMap.get(1));
        hashMap.remove(1);
        System.out.println(hashMap);
        System.out.println(hashMap.size());
        for (Integer i:hashMap.keySet()){
            System.out.println("key:"+i+",value:"+hashMap.get(i));
        }
        for(String value:hashMap.values()){
            System.out.println(value+",");
        }*/
        /*HashSet<String> hashSet=new HashSet<String>();
        hashSet.add("Google");
        hashSet.add("Runoob");
        hashSet.add("taobao");
        hashSet.add("zhihu");
        System.out.println(hashSet);
        System.out.println(hashSet.contains("taobao"));
        hashSet.remove("taobao");
        System.out.println(hashSet);
        hashSet.clear();
        System.out.println(hashSet);
        System.out.println(hashSet.size());*/
        /*
        LinkedList<String> linkedList=new LinkedList<String>();
        linkedList.add("Google");
        linkedList.add("baidu");
        linkedList.add("taobao");
        linkedList.addFirst("weibo");
        linkedList.addLast("jingdong");
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);
        for(int i=0;i<linkedList.size();i++){
            System.out.println(linkedList.get(i));
        }
        for(String s:linkedList){
            System.out.println(s);
        }
*/

       /* ArrayList<Integer> arrayList=new ArrayList<Integer>();
        arrayList.add(10);
        arrayList.add(15);
        arrayList.add(20);
        arrayList.add(25);
        for (int i:arrayList){
            System.out.println(i);
        }*/
        /*ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("Google");
        arrayList.add("Runoob");
        arrayList.add("taobao");
        arrayList.add("weibo");
        arrayList.set(2,"wiki");
        arrayList.remove(3);
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
        for(String i:arrayList){
            System.out.println(i);
        }*/
     /*   System.out.println("请输入数字：");
        Scanner scan=new Scanner(System.in);
        double sum=0.0;
        int num=0;
        while(scan.hasNextDouble()){
            double x=scan.nextDouble();
            sum+=x;
            num++;
        }
        System.out.println(num+"个数的和为："+sum);
        System.out.println(num+"个数的平均值是"+(sum/num));*/
    }
}
