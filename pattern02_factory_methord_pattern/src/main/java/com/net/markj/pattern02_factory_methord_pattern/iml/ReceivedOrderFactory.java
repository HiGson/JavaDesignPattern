package com.net.markj.pattern02_factory_methord_pattern.iml;

import com.net.markj.pattern02_factory_methord_pattern.inter.OrderFactory;
import com.net.markj.pattern02_factory_methord_pattern.public_class.Order;
import com.net.markj.pattern02_factory_methord_pattern.public_class.ReceivedOrder;

/**
 * Created by Kron Xu on 2019/3/9 11:47
 * Description:
 */
public class ReceivedOrderFactory implements OrderFactory {
    @Override
    public Order getOrder() {
        return new ReceivedOrder();
    }
}
