package com.java.string;

/**
 * @author luo xinglin
 * @date 2019/6/3 - 15:55
 */
public class StringBufferTest {
    //Java StringBuffer和StringBuilder类
    //当对字符串进行修改的时候，需要使用StringBuffer和StringBuilder类。
    //
    //和String类不同的是，StringBuffer和StringBuilder类的对象能够被多次的修改，并且不产生新的未使用对象。
    //
    //StringBuilder类在Java 5中被提出，它和StringBuffer之间的最大不同在于StringBuilder的方法
    // 不是线程安全的（线程安全就是多线程访问时，采用了加锁机制，当一个线程访问该类的某个数据时，进行保护，
    // 其他线程不能进行访问直到该线程读取完，其他线程才可使用。不会出现数据不一致或者数据污染。线程不安全
    // 就是不提供数据访问保护，有可能出现多个线程先后更改数据造成所得到的数据是脏数据）。
    //
    //由于StringBuilder相较于StringBuffer有速度优势，所以多数情况下建议使用StringBuilder类。
    //然而在应用程序要求线程安全的情况下，则必须使用StringBuffer类。


    //StringBuffer和StringBuilder支持的方法
    //StringBuffe和StringBuilder类的方法和String类部分类似，特有的方法有：
    //
    //
    //public StringBuffer append(String s)
    //将指定的字符串追加到此字符序列。
    //
    //public StringBuffer reverse()
    //将此字符序列用其反转形式取代。
    //
    //public delete(int start, int end)
    //移除此序列的子字符串中的字符。
    //
    //public insert(int offset, int i)
    //将 int 参数的字符串表示形式插入此序列中。
    //
    //replace(int start, int end, String str)
    //使用给定 String 中的字符替换此序列的子字符串中的字符。
    //
    //int capacity()
    //返回当前容量
    //
    //void setCharAt(int index, char ch)
    //将给定索引处的字符设置为 ch。
    //
    //void setLength(int newLength)
    //设置字符序列的长度。
    //
    //String、StringBuffer和StringBuilder的区别
    //1. 对象的可变与不可变
    //String对象不可变，StringBuffer和StringBuilder对象可变。
    //2. 线程是否安全
    //
    //String中的对象是不可变的，也就可以理解为常量，所以线程安全。
    //StringBuffer中的方法大都采用了synchronized关键字修饰，所以是线程安全的。
    //StringBuilder没有对方法进行加同步锁，所以是非线程安全的。
    //
    //3. 字符串追加速度比较
    //StringBuilder > StringBuffer > String
    //4. StringBuffer和StringBuilder的共同点
    //
    //StringBuffer和StringBuilder有公共的抽象父类AbstractStringBuilder
    //抽象类与一个接口的区别是：抽象类中可以定义一些子类的公共方法，子类只需要增加新的功能，不需要重复写已经存在的方法；而接口中只是对方法的申明和常量的定义。
    //StringBuilder和StringBuffer的方法都会调用AbstractStringBuilder中的公共方法，如super.append(...)。只是StringBuffer会在方法上加上synchronized关键字，进行同步。
    //如果程序不是多线程的，那么使用StringBuilder效率高于StringBuffer。
    //
    //总结一下：
    //String：适用于少量的字符串操作的情况
    //StringBuilder：适用于单线程下在字符缓冲区进行大量操作的情况
    //StringBuffer：适用于多线程下在字符缓冲区进行大量操作的情况
    //
    //作者：牽妳佐手
    //链接：https://www.jianshu.com/p/5d5ea61256b6
    //来源：简书
    //简书著作权归作者所有，任何形式的转载都请联系作者获得授权并注明出处。

}
