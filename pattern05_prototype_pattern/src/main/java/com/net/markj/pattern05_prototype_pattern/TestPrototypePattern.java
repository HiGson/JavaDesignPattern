package com.net.markj.pattern05_prototype_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kron Xu on 2019/3/9 21:22
 * Description:
 */
public class TestPrototypePattern {
    public static void main(String []args){
//        shallowClone(); //浅度克隆
        deepClone();// 深度克隆
    }

    private static void deepClone() {
        DeepClone deepClone = new DeepClone();
        deepClone.setName("Kron Xu");
        deepClone.setAge(28);
        deepClone.setNumber("123456");

        List<String> list = new ArrayList<>();
        list.add("Wenjun");
        list.add("Qian");
        list.add("Ming");

        deepClone.setFriends(list);
        System.out.println(deepClone.getName());
        System.out.println(deepClone.getAge());
        System.out.println(deepClone.getNumber());
        for (String friend : deepClone.getFriends()){
            System.out.println(friend);
        }

        DeepClone deepClone1 = deepClone.clone();
        deepClone1.setName("Wenjun");

        System.out.println("\n\n" + deepClone1.getName());
        System.out.println(deepClone1.getAge());
        System.out.println(deepClone1.getNumber());
        for (String friend : deepClone1.getFriends()){
            System.out.println(friend);
        }

        System.out.println("\n\n" );


        deepClone.getFriends().set(0,"Qun"); // 修改原对象中的对象的数据，用于查看深度克隆的效果
        for (String friend : deepClone.getFriends()){
            System.out.println(friend);
        }
        System.out.println("\n\n" );
        for (String friend : deepClone1.getFriends()){
            System.out.println(friend); // 由于是深度克隆，为类对象的对象开辟了新空间，使用的还是新的堆空间，所以集合中的数据不会随shallowClone1的数据变化而变化
        }

    }

    private static void shallowClone(){
        ShallowClone shallowClone = new ShallowClone();
        shallowClone.setName("Kron Xu");
        shallowClone.setAge(28);
        shallowClone.setNumber("123456");

        List<String> list = new ArrayList<>();
        list.add("Wenjun");
        list.add("Qian");
        list.add("Ming");

        shallowClone.setFriends(list);
        System.out.println(shallowClone.getName());
        System.out.println(shallowClone.getAge());
        System.out.println(shallowClone.getNumber());
        for (String friend : shallowClone.getFriends()){
            System.out.println(friend);
        }

        ShallowClone shallowClone1 = shallowClone.clone();
        shallowClone1.setName("Wenjun");

        System.out.println("\n\n" + shallowClone1.getName());
        System.out.println(shallowClone1.getAge());
        System.out.println(shallowClone1.getNumber());
        for (String friend : shallowClone1.getFriends()){
            System.out.println(friend);
        }

        System.out.println("\n\n" );


        shallowClone.getFriends().set(0,"Qun"); // 修改原对象中的对象的数据，用于查看浅度克隆的效果
        for (String friend : shallowClone.getFriends()){
            System.out.println(friend);
        }
        System.out.println("\n\n" );
        for (String friend : shallowClone1.getFriends()){
            System.out.println(friend);  // 由于是浅度克隆，没有为类对象的对象开辟空间，使用的还是原堆空间，所以集合中的数据会随shallowClone1的数据变化而变化
        }

    }
}
