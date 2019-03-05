package com.net.markj.observerpattern.observer2;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Kron Xu on 2019/3/6 1:50
 * Description:
 */
public class ThiefObservable2 extends Observable {

    List<Observer> list = new ArrayList();

    public void addObserver(Observer observer){
        if (!list.contains(observer)){
        list.add(observer);

        }
    }

    public void removeObserver(Observer observer){
        if (list.contains(observer)){
            list.remove(observer);
        }
    }

    public void notyfyObserver(){
        for (Observer observer : list){
            observer.update(this,"我又偷东西啦，可惜你们抓不到我 O(∩_∩)O哈哈~");
        }
    }
}
