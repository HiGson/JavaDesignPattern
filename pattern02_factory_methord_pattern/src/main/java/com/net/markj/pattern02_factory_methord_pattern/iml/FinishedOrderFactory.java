package com.net.markj.pattern02_factory_methord_pattern.iml;

import com.net.markj.pattern02_factory_methord_pattern.inter.OrderFactory;
import com.net.markj.pattern02_factory_methord_pattern.public_class.FinishedOrder;
import com.net.markj.pattern02_factory_methord_pattern.public_class.Order;

/**
 * Created by Kron Xu on 2019/3/9 11:44
 * Description:
 */
public class FinishedOrderFactory implements OrderFactory {

    @Override
    public Order getOrder() {
        return new FinishedOrder();
    }
}
