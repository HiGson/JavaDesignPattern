package com.net.markj.pattern03_abstract_factory_pattern;

import com.net.markj.pattern03_abstract_factory_pattern.factory.NorthFruitFactory;
import com.net.markj.pattern03_abstract_factory_pattern.factory.SouthFruitFactory;
import com.net.markj.pattern03_abstract_factory_pattern.inter.FruitFactory;

/**
 * Created by Kron Xu on 2019/3/9 13:02
 * Description:
 */
public class TestAbstractFactoryPattern {
    public static void main(String []args){
        FruitFactory fruitFactory1 = new NorthFruitFactory();
        System.out.println(fruitFactory1.getApple().getFruitName());
        System.out.println(fruitFactory1.getBanana().getFruitName());


        System.out.println("----------------------------------");
        FruitFactory fruitFactory2 = new SouthFruitFactory() ;
        System.out.println(fruitFactory2.getApple().getFruitName());
        System.out.println(fruitFactory2.getBanana().getFruitName());

    }
}
