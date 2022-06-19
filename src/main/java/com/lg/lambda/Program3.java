package com.lg.lambda;

/**
 * @author amazfit
 * @date 2022-06-19 下午10:08
 * 1、参数类型可以省略
 * 2、一个参数，可以把小括号省略
 *
 * 3、方法体只有一个语句，可以把大括号省略
 *
 * 4、如果方法体中唯一的语句是return返回语句，那省略大括号的同时return也要省略
 **/
public class Program3 {

    public static void main(String[] args) {
        If1 if1 = ()->System.out.println("无参数返回值");

        if1.test();

        If2 if2 = a->System.out.println("单个参数无返回值,a="+a);

        if2.test(2);

        If3 if3 = (a,b)->System.out.println("两个参数无返回值,a="+a+",b="+b);
        if3.test(1,2);

        If4 if4 = ()->4;
        System.out.println("无参数有返回值:"+if4.test());

        If5 if5 = a->a;
        System.out.println("有参数有返回值："+if5.test(5));

        If6 if6 = (a,b)->a-b;
        System.out.println("有参数有返回值："+if6.test(7,1));
    }

    interface If1{
        void test();
    }

    interface If2{
        void test(int a);
    }

    interface If3{
        void test(int a,int b);
    }

    interface If4{
        int test();
    }

    interface If5{
        int test(int a);
    }

    interface If6{
        int test(int a,int b);
    }
}
