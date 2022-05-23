package com.oxford.math;

import org.apache.commons.math3.util.ArithmeticUtils;

/**
 * 最大公约数计算
 *
 * @author Chova
 * @date 2022/05/23
 */
public class GcdCalculate {

    public static void main(String[] args) {
        int p = 520;
        int q = 1314;

        // 计算两个数的最大公约数
        int gcd = ArithmeticUtils.gcd(p, q);
        System.out.println("数字" + p + "和数字" + q + "的最大公约数：" + gcd);
    }
}
