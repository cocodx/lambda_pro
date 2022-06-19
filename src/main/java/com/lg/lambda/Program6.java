package com.lg.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * @author amazfit
 * @date 2022-06-19 下午11:16
 **/
public class Program6 {

    public static void main(String[] args) {
        List<Dog> list = new ArrayList<>();
        list.add(new Dog("aa",1));
        list.add(new Dog("bb",2));
        list.add(new Dog("cc",3));
        list.add(new Dog("dd",4));
        list.add(new Dog("ee",5));
        list.add(new Dog("ff",6));

        System.out.println("lambda表达式集合排序");
        list.sort((o1,o2)->o1.getAge()-o2.getAge());

        System.out.println(list);

        System.out.println("lambda表达式集合遍历");
        list.forEach(System.out::println);
    }
}
