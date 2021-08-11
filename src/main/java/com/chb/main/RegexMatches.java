package com.chb.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {
    public static void main(String[] args) {
        String line="热烈庆祝伟大的中国共产党诞辰100周年！";
        String pattern="(\\D*)(\\d+)(.*)";
        Pattern r=Pattern.compile(pattern);
        //创建matcher对象
        Matcher m=r.matcher(line);
        if(m.find()){
            System.out.println(m.group(0));
            System.out.println(m.group(1));
            System.out.println(m.group(2));
            System.out.println(m.group(3));
        }
    }
}
