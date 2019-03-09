package com.net.markj.pattern04_single_instance_pattern;

/**
 * Created by Kron Xu on 2019/3/9 20:51
 * Description:
 */
public class TestSingleInstance {
    public static void main(String []args){
        // 饿汉式单例模式
        Person01 person01 = Person01.getPerson();

        // 懒汉式单例模式 1
        Person02 person02 = Person02.getPerson();

        // 懒汉式单例模式 2
        Person03 person03 = Person03.getPerson();

        // 懒汉式单例模式 3
        Person04 person04 = Person04.getPerson();

        // 懒汉式单例模式 4
        Person05 person05 = Person05.getPerson();

        // 懒汉式单例模式 5
        Person06 person06 = Person06.getPerson();
    }
}
