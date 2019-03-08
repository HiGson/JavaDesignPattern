package com.net.markj.observerpattern.observer2;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Kron Xu on 2019/3/6 1:50
 * Description:
 */
public class PoliceObserver2 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println((String)arg);
    }
}
