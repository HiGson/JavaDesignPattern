package com.net.markj.pattern01_simple_pattern;

import com.net.markj.pattern01_simple_pattern.factory.Facroty01;
import com.net.markj.pattern01_simple_pattern.factory.Factory02;
import com.net.markj.pattern01_simple_pattern.factory.Factory03;

/**
 * Created by Kron Xu on 2019/3/8 16:02
 * Description: 简单工厂方法模式是类的创建型模式，被创建实例的类通常拥有共同的父类
 */
public class TestSimpleFactory {
    public static void main(String []args){
        testFactory01();
        System.out.println("------------------------------------------------");

        testFactory02();
        System.out.println("------------------------------------------------");

        testFactory03();
    }

    private static void testFactory03() {
        try {
            System.out.println(Factory03.getOrder("com.net.markj.pattern01_simple_pattern.public_class.FinishedOrder").getOrderType());
            System.out.println(Factory03.getOrder("com.net.markj.pattern01_simple_pattern.public_class.ReceivedOrder").getOrderType());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    private static void testFactory02() {
        try {
            System.out.println(Factory02.getOrder("finished").getOrderType());
            System.out.println(Factory02.getOrder("received").getOrderType());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    private static void testFactory01() {
        System.out.println(Facroty01.getReceivedOrder().getOrderType());
        System.out.println(Facroty01.getFinishedOrder().getOrderType());
    }
}
