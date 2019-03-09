package com.net.markj.pattern05_prototype_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kron Xu on 2019/3/9 21:43
 * Description:
 */
public class DeepClone implements Cloneable {
    public String name;
    public int age;
    public String number;

    List<String> friends = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }


    public DeepClone clone(){
        try {
            DeepClone deepClone = (DeepClone) super.clone();
            List<String> newList = new ArrayList<>();  //实例化一个对象
            for (String friend : this.getFriends()){// 将原对象中的数据拷贝到新对象各种
                newList.add(friend);
            }
            deepClone.setFriends(newList);
            return deepClone;
        } catch (CloneNotSupportedException e) {// 当没有实现Cloneable接口时会抛出这个异常
            e.printStackTrace();
            return null;
        }
    }
}
