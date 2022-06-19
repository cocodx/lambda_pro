package com.lg.lambda;

/**
 * @author amazfit
 * @date 2022-06-19 下午10:08
 * 方法引用
 **/
public class Program4 {

    public static void main(String[] args) {
        Program4 program4 = new Program4();
        If5 if5 = program4::test;
        System.out.println(if5.test(5));

        If5 if52=(a)->a-2;
        System.out.println(if52.test(5));

        If5 if53 = Program4::testB;
        System.out.println(if53.test(3));
        System.out.println(if53.test(10));
    }

    public int test(int a){
        return a-2;
    }

    public static int testB(int a){
        return a-2;
    }



    interface If5{
        int test(int a);
    }
}
