package com.java.processctrl;

import org.junit.Test;

/**
 * @author luo xinglin
 * @date 2019/6/3 - 15:04
 */
public class ProcessCtrlTest {
    @Test
    public void test1() {
        //兔子的规律为数列1,1,2,3,5,8,13,21....
        System.out.println(f1(6));
    }

    public int f1(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return f1(n - 1) + f1(n - 2);
        }

    }

    //判断一个是不是素数, 素数只能被1或其本身整除
    //思路：   一个数若可以进行因数分解，那么分解时得到的两个数一定是一个小于等于sqrt(n)，一个大于等于sqrt(n)
    //        一个大于等于5的素数只能是 6x-1或6x+1
    @Test
    public void test2() {

    }

    public boolean isPrime(int num) {
        if (num <= 3) {
            return false;
        }
        if (num % 6 != 1 && num % 6 != 5) {
            return false;
        }
        int sqrt = (int) Math.sqrt(num);
        for (int i = 5; i < sqrt; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }


}
