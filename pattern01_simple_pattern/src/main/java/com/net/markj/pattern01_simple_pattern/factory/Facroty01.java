package com.net.markj.pattern01_simple_pattern.factory;

import com.net.markj.pattern01_simple_pattern.public_class.FinishedOrder;
import com.net.markj.pattern01_simple_pattern.public_class.ReceivedOrder;

/**
 * Created by Kron Xu on 2019/3/8 16:00
 * Description:
 */
public class Facroty01 {
    public static FinishedOrder getFinishedOrder(){
        return new FinishedOrder();
    }

    public static ReceivedOrder getReceivedOrder(){
        return new ReceivedOrder();
    }
}
