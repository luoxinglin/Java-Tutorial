package com.java.operator;

import org.junit.Test;

/**
 * @author luo xinglin
 * @date 2019/6/3 - 14:33
 */
public class OperatorTest {

    //算数运算符,与数学表示用法一样，+ - * / % ++ --
    @Test
    public void test01() {

    }

    //关系运算符， == != > < >= <=
    @Test
    public void test2() {

    }

    //位运算符，应用于整数类型(int)，长整型(long)，短整型(short)，字符型(char)，和字节型(byte)等类型。
    //& | ^ ~ << >> >>>
    @Test
    public void test3() {
        int a = 60; /* 60 = 0011 1100 */
        int b = 13; /* 13 = 0000 1101 */
        int c = 0;
        c = a & b;       /* 12 = 0000 1100 */
        System.out.println("a & b = " + c );

        c = a | b;       /* 61 = 0011 1101 */
        System.out.println("a | b = " + c );

        c = a ^ b;       /* 49 = 0011 0001 */
        System.out.println("a ^ b = " + c );

        c = ~a;          /*-61 = 1100 0011 */   //按位翻转
        System.out.println("~a = " + c );

        c = a << 2;     /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c );

        c = a >> 2;     /* 215 = 1111 */
        System.out.println("a >> 2  = " + c );

        c = a >>> 2;     /* 215 = 0000 1111 */ // 右移，空出的位置0调充
        System.out.println("a >>> 2 = " + c );
    }

    //逻辑运算符 && || !
    @Test
    public void test4() {
        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a&&b));
        System.out.println("a || b = " + (a||b) );
        System.out.println("!(a && b) = " + !(a && b));
    }

    //复制运算符
    //=	简单的赋值运算符，将右操作数的值赋给左侧操作数	C = A + B将把A + B得到的值赋给C
    //+ =	加和赋值操作符，它把左操作数和右操作数相加赋值给左操作数	C + = A等价于C = C + A
    //- =	减和赋值操作符，它把左操作数和右操作数相减赋值给左操作数	C - = A等价于C = C -
    // A
    //* =	乘和赋值操作符，它把左操作数和右操作数相乘赋值给左操作数	C * = A等价于C = C * A
    /// =	除和赋值操作符，它把左操作数和右操作数相除赋值给左操作数	C / = A等价于C = C / A
    //（％）=	取模和赋值操作符，它把左操作数和右操作数取模后赋值给左操作数	C％= A等价于C = C％A
    //<< =	左移位赋值运算符	C << = 2等价于C = C << 2
    //>> =	右移位赋值运算符	C >> = 2等价于C = C >> 2
    //＆=	按位与赋值运算符	C＆= 2等价于C = C＆2
    //^ =	按位异或赋值操作符	C ^ = 2等价于C = C ^ 2
    //| =	按位或赋值操作符	C | = 2等价于C = C | 2
    @Test
    public void test5() {

    }

    //其他运算符： ?:     instanceof
    @Test
    public void test6() {

    }

    //最高优先级的运算符在的表的最上面，最低优先级的在表的底部
    //类别	        操作符	            关联性
    //后缀	       () [] . (点操作符)	左到右
    //一元	        + + - ！〜	        从右到左
    //乘性 	        * / ％	            左到右
    //加性 	        + -	                左到右
    //移位 	        >> >>>  << 	        左到右
    //关系 	        >> = << = 	        左到右
    //相等 	        ==  !=	            左到右
    //按位与	        ＆	                左到右
    //按位异或	    ^	                左到右
    //按位或       	|	                左到右
    //逻辑与	        &&	                左到右
    //逻辑或	        | |	                左到右
    //条件	        ？：	                从右到左
    //赋值	        =   +=  -=   *= /=  ％=    >>=     <<=     ＆=  ^=  |=  	从右到左
    //逗号	        ，	                左到右
}
