package com.net.markj.pattern06_builder_pattern;

/**
 * Created by Kron Xu on 2019/3/9 22:51
 * Description:
 */
public class ApartmentBuilder implements Builder {
    House house = new House();
    @Override
    public void makeRoof() {
        house.setRoof("公寓  房顶");
    }

    @Override
    public void makeWall() {
        house.setWall("公寓  墙");
    }

    @Override
    public void makeFloor() {
        house.setFloor("公寓  地板");
    }

    public House getHouse(){
        return house;
    }
}
