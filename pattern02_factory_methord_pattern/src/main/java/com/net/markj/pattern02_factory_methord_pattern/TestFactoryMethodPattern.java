package com.net.markj.pattern02_factory_methord_pattern;

import com.net.markj.pattern02_factory_methord_pattern.iml.FinishedOrderFactory;
import com.net.markj.pattern02_factory_methord_pattern.iml.ReceivedOrderFactory;

/**
 * Created by Kron Xu on 2019/3/9 11:48
 * Description: 工厂方法模式将类的实例化放到工厂类的子类中去实现，当添加了新的类之后，只需要添加工厂类子类即可。
 *  代码中创建了一个OrderFactory接口和实现了这个接口的两个工厂类FinishedOrderFactory和ReceivedOrderFactory，在
 *  两个子类中去实例化对象
 */
public class TestFactoryMethodPattern {
    public static void main(String []args){
        FinishedOrderFactory finishedOrderFactory= new FinishedOrderFactory();
        System.out.println(finishedOrderFactory.getOrder().getOrderType());

        ReceivedOrderFactory receivedOrderFactory = new ReceivedOrderFactory();
        System.out.println(receivedOrderFactory.getOrder().getOrderType());
    }
}
