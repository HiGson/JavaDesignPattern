package com.net.markj.pattern01_simple_pattern.public_class;

/**
 * Created by Kron Xu on 2019/3/8 15:57
 * Description:
 */
public class FinishedOrder implements Order {
    @Override
    public String getOrderType() {
        return "已完成订单";
    }
}
