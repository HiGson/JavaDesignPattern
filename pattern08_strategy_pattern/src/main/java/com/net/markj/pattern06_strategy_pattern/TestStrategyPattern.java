package com.net.markj.pattern06_strategy_pattern;

/**
 * Created by Kron Xu on 2019/3/10 1:35
 * Description: 策略模式对一系列算法进行封装，为所有算法定义一个抽象接口，并通过继承这个接口来对各种算法进行实现和封装，
 * 具体使用哪一种算法由客户端决定
 *
 * 策略模式与装饰模式类似，都会使用一个接口，子类实现这个接口，并且在构造方法中持有父类对象，区别在于策略模式子类没有直接implements父类
 */
public class TestStrategyPattern {
    public static void main(String []args){
        new EncryptionCreator(new Base64Encryption()).encrypt();
        new EncryptionCreator(new MD5Encryption()).encrypt();
    }
}
