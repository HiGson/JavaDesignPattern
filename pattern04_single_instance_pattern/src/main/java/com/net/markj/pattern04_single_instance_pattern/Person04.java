package com.net.markj.pattern04_single_instance_pattern;

/**
 * Created by Kron Xu on 2019/3/9 20:47
 * Description:  懒汉式单例模式，懒汉式在外界调用方法是才初始化对象
 *
 * 解决Person03问题
 */
public class Person04 {

    private static Person04 person04;
    // 1、私有化构造方法
    private Person04(){
    }

    // 2、提供静态方法，供外界获取对象，使用同步方法
    public static synchronized Person04 getPerson(){
        if (person04 == null){
            person04 = new Person04();
        }
        return person04;
    }

    // 缺点：虽然解决了Person03的问题，但是每次调用都会进行同步
}
