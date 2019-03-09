package com.net.markj.pattern05_prototype_pattern;

/**
 * Created by Kron Xu on 2019/3/9 21:13
 * Description: 原型模式，原型模式是将现有对象进行复制，会开辟另外一个堆空间，两个空间之间的数据互不影响，
 * 原型模式的实现原理是克隆，分为浅度克隆，浅度克隆
 * 原型模式多用于需要创建一个对象，改对象与已有对象只有少量数据不同的情况，新对象只需要设置与已有对象不同的数据即可
 *
 * 当一个类中还有其他的对象时，浅度克隆不会对类中的对象进行复制，不会另外开辟空间，而深度克隆会
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 浅度克隆
 */
public class ShallowClone implements Cloneable{ // 原型模式必须要实现Cloneable接口
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


    public ShallowClone clone(){
        try {
            return (ShallowClone)super.clone();
        } catch (CloneNotSupportedException e) {// 当没有实现Cloneable接口时会抛出这个异常
            e.printStackTrace();
            return null;
        }
    }
}
