package com.net.markj.pattern01_simple_pattern.factory;

import com.net.markj.pattern01_simple_pattern.public_class.Order;

/**
 * Created by Kron Xu on 2019/3/8 16:10
 * Description:
 */
public class Factory03 {
    public static Order getOrder(String className) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class orderClass = Class.forName(className);
        return (Order) orderClass.newInstance();
    }
}
