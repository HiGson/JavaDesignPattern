package com.net.markj.pattern03_abstract_factory_pattern.factory;

import com.net.markj.pattern03_abstract_factory_pattern.iml.NorthBanana;
import com.net.markj.pattern03_abstract_factory_pattern.iml.products.NorthApple;
import com.net.markj.pattern03_abstract_factory_pattern.inter.Fruit;
import com.net.markj.pattern03_abstract_factory_pattern.inter.FruitFactory;

/**
 * Created by Kron Xu on 2019/3/9 12:56
 * Description:
 */
public class NorthFruitFactory implements FruitFactory {
    @Override
    public Fruit getApple() {
        return new NorthApple();
    }

    @Override
    public Fruit getBanana() {
        return new NorthBanana();
    }
}
