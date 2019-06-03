package com.java.string;

import org.junit.Test;

/**
 * @author luo xinglin
 * @date 2019/6/3 - 15:55
 */
public class StringTest {
    //String类：
    //字符串，所有字符串字面值都作为此类的实现，作为常量，在创建后不能被修改，只支持共享，字符串缓冲区支持可变的字符串
    //底层由字符数组维护，成员变量可以知道String类的值是final类型的，不能被改变的，
    //所以只要一个值改变就会生成一个新的String类型对象，存储String数据也不一定从数组的第0个元素开始的，而是从offset所指的元素开始。

    //创建字符串对象两种方式的区别
    //  直接赋值（String str = "hello"）：只开辟一块堆内存空间，并且会自动入池，不会产生垃圾。
    //  构造方法（String str=  new String("hello");）:会开辟两块堆内存空间，其中一块堆内存会变成垃圾被系统回收，
    //而且不能够自动入池，需要通过public  String intern();方法进行手工入池。
    //  在开发的过程中不会采用构造方法进行字符串的实例化。
    public void test1() {
        //1. 直接赋值方式创建对象(方法区的常量值)
        String str1 = "hello";
        //2. 通过构造方法创建字符串(堆内存、栈内存)
        String str2 = new String("hello");

    }

    //常用方法
    @Test
    public void test2() {
        //下标从0开始
        String str = "hello";
        System.out.println(str.length());
        System.out.println(str.indexOf('h'));
        System.out.println(str.lastIndexOf('l'));
        System.out.println(str.charAt(1));

    }

    @Test
    public void test3() {
        String str = "World";
        char[] strs = str.toCharArray();
        for (char c : strs) {
            System.out.print(c + ":");
        }
        String str2 = String.valueOf(1);
        System.out.println(str2);
        String str3 = str.toLowerCase();
        System.out.println(str3);
        String str4 = str.toUpperCase();
        System.out.println(str4);
    }

    @Test
    public void test4() {
        // 创建字符串对象
        String s1 = "helloworld";
        String s2 = " helloworld ";
        String s3 = " hello world ";
        System.out.println("---" + s1 + "---");
        System.out.println("---" + s1.trim() + "---");
        System.out.println("---" + s2 + "---");
        System.out.println("---" + s2.trim() + "---");
        System.out.println("---" + s3 + "---");
        System.out.println("---" + s3.trim() + "---");
        System.out.println("-------------------");

        // String[] split(String str)
        // 创建字符串对象
        String s4 = "aa,bb,cc";
        String[] strArray = s4.split(",");
        for (int x = 0; x < strArray.length; x++) {
            System.out.println(strArray[x]);
        }
    }

    @Test
    public void test5() {
        // 创建字符串对象
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "Hello";

        // boolean equals(Object obj):比较字符串的内容是否相同
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println("-----------");

        // boolean equalsIgnoreCase(String str):比较字符串的内容是否相同,忽略大小写
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println("-----------");

        // boolean startsWith(String str):判断字符串对象是否以指定的str开头
        System.out.println(s1.startsWith("he"));
        System.out.println(s1.startsWith("ll"));
    }

    @Test
    public void test6() {
        // 创建字符串对象
        String s = "helloworld";
        // String substring(int start):从start开始截取字符串
        System.out.println(s.substring(0));
        System.out.println(s.substring(5));
        System.out.println("--------");

        // String substring(int start,int end):从start开始，到end结束截取字符串
        System.out.println(s.substring(0, s.length()));
        System.out.println(s.substring(3, 8));
    }

}
