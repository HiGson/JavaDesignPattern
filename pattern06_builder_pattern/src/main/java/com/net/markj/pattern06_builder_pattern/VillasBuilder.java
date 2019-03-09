package com.net.markj.pattern06_builder_pattern;

/**
 * Created by Kron Xu on 2019/3/9 22:36
 * Description: 别墅工程队，修建别墅
 */
public class VillasBuilder implements Builder {

    House house = new House();

    @Override
    public void makeRoof() {
        house.setRoof("别墅  屋顶");
    }

    @Override
    public void makeWall() {
        house.setWall("别墅  墙");
    }

    @Override
    public void makeFloor() {
        house.setFloor("别墅  地板");
    }

    public House getHouse(){
        return house;
    }
}
