package org.martin.baseapi;

import java.util.Random;

/**
 * 包名：
 * 构造方法：
 * 成员函数：
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random rnd = new Random();
        int num = rnd.nextInt(); // int 范围内的数字
        int num2 = rnd.nextInt(10); // 左闭右开 [0,10)


    }
}
