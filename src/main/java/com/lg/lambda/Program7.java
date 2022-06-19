package com.lg.lambda;

/**
 * @author amazfit
 * @date 2022-06-19 下午11:23
 * 接口里只能有一个抽象方法
 **/
public class Program7 {

    @FunctionalInterface
    public interface TestInterface{
        public void sub();

        public boolean equals(Object var1);

        public default void defaultMethod(){

        }

        public static void staticMethod(){

        }
    }

    @FunctionalInterface
    public interface TestInterface1{
        public void sub1();
    }
}
