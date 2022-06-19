package com.lg.lambda;

/**
 *
 * https://www.bilibili.com/video/BV1ci4y1g7qD?p=2&vd_source=bfe249ea8880533927ff8d5166add96d
 * @author amazfit
 * @date 2022-06-19 上午2:44
 * 箭头函数，本质是一个函数
 **/
public class Program {

    public static void main(String[] args) {
        Cal cal = new Cal(){

            @Override
            public int add(int a, int b) {
                return a+b;
            }
        };

        //lambda表示式
        Cal cal1 = (int a,int b)->{
            return a+b;
        };

        System.out.println(cal1.add(1,2));
    }

    interface Cal{
        int add(int a,int b);
    }
}
