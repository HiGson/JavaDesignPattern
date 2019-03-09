package com.net.markj.pattern06_builder_pattern;

/**
 * Created by Kron Xu on 2019/3/9 22:43
 * Description: 使用场景：
 * 1、创建的是一个复合对象（被创建的对象为一个具有复合属性的复合对象），
 * 2、关注对象创建的各部分的创建过程（不同的Builder对产品的属性有不同的创建方法）
 *
 * 比如建房子，要建屋顶、墙和地板，但是要将公寓和别墅，两种房子的屋顶、墙和地板可能相同，也可能不同，此时就可以用建造者模式
 */
public class TestBuilderPattern {
    public static void main(String []args){
        VillasBuilder builder = new VillasBuilder();
        HouseDirector.build(builder);
        House house = builder.getHouse();
        System.out.println(house.getRoof() +  "     " + house.getWall() + "     " + house.getFloor());

        ApartmentBuilder builder1 = new ApartmentBuilder();
        HouseDirector.build(builder1);
        House house1 = builder1.getHouse();
        System.out.println(house1.getRoof() +  "     " + house1.getWall() + "     " + house1.getFloor());

    }
}
