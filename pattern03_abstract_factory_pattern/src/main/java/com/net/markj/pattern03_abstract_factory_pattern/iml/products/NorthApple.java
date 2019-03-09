package com.net.markj.pattern03_abstract_factory_pattern.iml.products;

import com.net.markj.pattern03_abstract_factory_pattern.iml.abstracts.abstract_products.AbstractApple;

/**
 * Created by Kron Xu on 2019/3/9 12:30
 * Description:
 */
public class NorthApple extends AbstractApple {
    @Override
    public String getFruitName() {
        return "NorthApple";
    }
}
