package com.net.markj.pattern04_single_instance_pattern;

/**
 * Created by Kron Xu on 2019/3/9 20:47
 * Description:  懒汉式单例模式，懒汉式在外界调用方法是才初始化对象
 * <p>
 * 解决Person03问题
 */
public class Person06 {

    private static Person06 person06;

    // 1、私有化构造方法
    private Person06() {
    }

    // 2、提供静态方法，供外界获取对象
    public static Person06 getPerson() {
        if (person06 == null) {
            synchronized (Person06.class) {
                if (person06 == null) {
                    person06 = new Person06();
                }
            }
        }
        return person06;
    }
}
