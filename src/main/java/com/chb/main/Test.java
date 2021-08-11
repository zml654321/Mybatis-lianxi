package com.chb.main;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        /*
        * 遍历Map
        * */
        Map<String,String> map=new HashMap<String,String>();
        map.put("1","value1");
        map.put("2","value2");
        map.put("3","value3");
        //第一种：普通使用，二次取值
        System.out.println("通过Map.keySet遍历key和value：");
        for(String key:map.keySet()){
            System.out.println("key="+key+" and value= "+map.get(key));
        }
        //第二种
        System.out.println("通过Map.entrySet使用iterator遍历key和value：");
        Iterator<Map.Entry<String,String>> it=map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String,String> entry=it.next();
            System.out.println("key="+entry.getKey()+"and value="+entry.getValue());
        }
        //第三种：推荐，尤其是容量大时
        System.out.println("通过Map.entrySet遍历key和value");
        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println("key="+entry.getKey()+" and value="+entry.getValue());
        }
        //第四种
        System.out.println("通过Map.values()遍历所有的value，但不能遍历key");
        for(String v:map.values()){
            System.out.println("value="+v);
        }
        /*
        * ArrayList 遍历的三种方式
        * */

     /* List<String> list=new ArrayList<String>();
      list.add("a");
      list.add("b");
      list.add("c");
      //使用for-each遍历List
      for(String str:list){
          System.out.println(str);
      }
      //链表变数组相关的内容进行遍历
      String[] strArray=new String[list.size()];
      list.toArray(strArray);
      for(int i=0;i<strArray.length;i++){
          System.out.println(strArray[i]);
      }
      //使用迭代器进行遍历
        Iterator<String> ite=list.iterator();
      while(ite.hasNext()){
          System.out.println(ite.next());
      }*/
    }
}
