package com.lg.lambda;

/**
 * @author amazfit
 * @date 2022-06-19 下午10:38
 * 构造方法引用
 **/
public class Program5 {

    public static void main(String[] args) {
        DogService dogService = ()->new Dog();
        System.out.println(dogService.getDog());

        DogService dogService1 = Dog::new;
        System.out.println(dogService1.getDog());

        DogService2 dogService2 = Dog::new;
        System.out.println(dogService2.getDog("小花",2));
    }

    @FunctionalInterface
    interface DogService{
        Dog getDog();
    }

    interface DogService2{
        Dog getDog(String name,int age);
    }


}
