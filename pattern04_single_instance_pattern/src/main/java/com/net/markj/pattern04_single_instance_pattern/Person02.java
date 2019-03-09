package com.net.markj.pattern04_single_instance_pattern;

/**
 * Created by Kron Xu on 2019/3/9 20:47
 * Description:  懒汉式单例模式，懒汉式在外界调用方法是才初始化对象
 */
public class Person02 {

    // 1、私有化构造方法
    private Person02(){
    }

    // 2、提供静态方法，供外界获取对象
    public static Person02 getPerson(){
        return new Person02();
    }

    // 缺点：每次调用getPerson()都会创建一个实例对象
}
