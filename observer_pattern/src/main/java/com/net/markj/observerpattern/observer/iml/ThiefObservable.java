package com.net.markj.observerpattern.observer.iml;

import com.net.markj.observerpattern.observer.inter.Observable;
import com.net.markj.observerpattern.observer.inter.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kron Xu on 2019/3/6 1:13
 * Description:
 */
public class ThiefObservable implements Observable {
    List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(String string) {
        for (Observer observer : observers){
            observer.update(string);
        }
    }
}
