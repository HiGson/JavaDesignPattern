package com.net.markj.pattern01_simple_pattern.factory;

import com.net.markj.pattern01_simple_pattern.public_class.FinishedOrder;
import com.net.markj.pattern01_simple_pattern.public_class.Order;
import com.net.markj.pattern01_simple_pattern.public_class.ReceivedOrder;

/**
 * Created by Kron Xu on 2019/3/8 16:06
 * Description:
 */
public class Factory02 {
    public static Order getOrder(String type) throws InstantiationException, IllegalAccessException {
        if (type.equals("finished")){
            return FinishedOrder.class.newInstance();
        }else if (type.equals("received")){
            return ReceivedOrder.class.newInstance();
        }else {
            System.out.println("没有找到相关类");
            return null;
        }
    }
}
