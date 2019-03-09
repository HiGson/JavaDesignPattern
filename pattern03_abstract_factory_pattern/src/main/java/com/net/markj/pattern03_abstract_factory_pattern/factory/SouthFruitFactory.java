package com.net.markj.pattern03_abstract_factory_pattern.factory;

import com.net.markj.pattern03_abstract_factory_pattern.iml.SouthApple;
import com.net.markj.pattern03_abstract_factory_pattern.iml.products.SouthBanana;
import com.net.markj.pattern03_abstract_factory_pattern.inter.Fruit;
import com.net.markj.pattern03_abstract_factory_pattern.inter.FruitFactory;

/**
 * Created by Kron Xu on 2019/3/9 12:46
 * Description:
 */
public class SouthFruitFactory implements FruitFactory {
    @Override
    public Fruit getApple() {
        return new SouthApple();
    }

    @Override
    public Fruit getBanana() {
        return new SouthBanana();
    }
}
