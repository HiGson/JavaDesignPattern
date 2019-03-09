package com.net.markj.pattern04_single_instance_pattern;

/**
 * Created by Kron Xu on 2019/3/9 20:47
 * Description:  懒汉式单例模式，懒汉式在外界调用方法是才初始化对象
 * <p>
 * 解决Person03问题
 */
public class Person05 {

    private static Person05 person05;

    // 1、私有化构造方法
    private Person05() {
    }

    // 2、提供静态方法，供外界获取对象
    public static Person05 getPerson() {
        if (person05 == null) {
            synchronized (Person05.class) {
                person05 = new Person05();
            }
        }
        return person05;
    }
}
