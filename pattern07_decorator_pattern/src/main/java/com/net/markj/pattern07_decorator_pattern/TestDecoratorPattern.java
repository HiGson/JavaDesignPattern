package com.net.markj.pattern07_decorator_pattern;

/**
 * Created by Kron Xu on 2019/3/10 0:21
 * Description: 装饰模式是一种功能扩展模式，类似于继承
 */
public class TestDecoratorPattern {
    public static void main(String []args){
        Bird bird = new Chicken(); //一个具体实现(实现一)
        bird.canRun();

        System.out.println("-------------------------------");

        Bird duckDecorator = new DuckDecorator(bird);//在实现一的基础上进行扩展（实现二）
        duckDecorator.showFunction();

        System.out.println("-------------------------------");

        Bird wildGooseDecorator = new WildGooseDecorator(bird);//在实现一的基础上进行扩展（实现三）
        wildGooseDecorator.showFunction();

        System.out.println("-------------------------------");

        Bird parrotDecorator = new ParrotDecorator(wildGooseDecorator);//在实现三的基础上进行扩展
        parrotDecorator.showFunction();
    }
}
