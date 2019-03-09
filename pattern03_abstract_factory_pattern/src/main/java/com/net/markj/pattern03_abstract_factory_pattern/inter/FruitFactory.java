package com.net.markj.pattern03_abstract_factory_pattern.inter;

/**
 * Created by Kron Xu on 2019/3/9 12:41
 * Description:对应产品结构，表示获取苹果和香蕉
 */
public interface FruitFactory {
    Fruit getApple();
    Fruit getBanana();
}
