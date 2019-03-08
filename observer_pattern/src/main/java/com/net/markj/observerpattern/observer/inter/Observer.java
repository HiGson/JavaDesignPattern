package com.net.markj.observerpattern.observer.inter;

/**
 * Created by Kron Xu on 2019/3/6 1:07
 * Description: 观察者
 */
public interface Observer {
    void update(String msg); //被观察者发生改变后调用此方法通知观察者更新操作
}
