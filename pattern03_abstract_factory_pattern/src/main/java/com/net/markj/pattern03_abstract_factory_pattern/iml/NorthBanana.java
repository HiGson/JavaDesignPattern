package com.net.markj.pattern03_abstract_factory_pattern.iml;

import com.net.markj.pattern03_abstract_factory_pattern.iml.abstracts.abstract_products.AbstractBanana;

/**
 * Created by Kron Xu on 2019/3/9 12:35
 * Description:
 */
public class NorthBanana extends AbstractBanana {
    @Override
    public String getFruitName() {
        return "NorthBanana";
    }
}
