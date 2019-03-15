package com.net.markj.observerpattern.observer.inter;

/**
 * Created by Kron Xu on 2019/3/6 1:09
 * Description: 被观察者
 */
public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver(String string);
}
