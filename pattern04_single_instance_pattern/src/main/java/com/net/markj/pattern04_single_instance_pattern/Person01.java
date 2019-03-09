package com.net.markj.pattern04_single_instance_pattern;

/**
 * Created by Kron Xu on 2019/3/9 20:47
 * Description:  饿汉式单例模式，饿汉式在类一开始就实例化一个对象
 */
public class Person01 {

    // 1、私有化构造方法
    private Person01(){
    }

    // 2、创建一个静态私有对象
    private static Person01 person01 = new Person01();

    // 3、提供静态方法，供外界获取对象
    public static Person01 getPerson(){
        return person01;
    }


}
