package com.net.markj.pattern04_single_instance_pattern;

/**
 * Created by Kron Xu on 2019/3/9 20:47
 * Description:  懒汉式单例模式，懒汉式在外界调用方法是才初始化对象
 *
 * 解决Person02问题
 */
public class Person03 {

    private static Person03 person03;
    // 1、私有化构造方法
    private Person03(){
    }

    // 2、提供静态方法，供外界获取对象
    public static Person03 getPerson(){
        if (person03 == null){
            person03 = new Person03();
        }
        return person03;
    }

    // 缺点：假设有两个线程，线程A和线程B，线程A进入到了if判断中，还没实例化Person03对象，此时线程B也进入到if判断中，
    // 此时两个线程都继续向下执行，都能创建对象，会创建多个对象
}
