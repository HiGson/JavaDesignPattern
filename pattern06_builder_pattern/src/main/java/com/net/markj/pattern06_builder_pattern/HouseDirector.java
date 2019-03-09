package com.net.markj.pattern06_builder_pattern;

/**
 * Created by Kron Xu on 2019/3/9 22:38
 * Description:
 */
public class HouseDirector {
    public static void build(Builder builder){
        builder.makeRoof();
        builder.makeWall();
        builder.makeFloor();
    }
}
