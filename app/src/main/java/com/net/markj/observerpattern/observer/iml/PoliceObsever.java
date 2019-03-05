package com.net.markj.observerpattern.observer.iml;

import com.net.markj.observerpattern.observer.inter.Observer;

/**
 * Created by Kron Xu on 2019/3/6 1:11
 * Description:
 */
public class PoliceObsever implements Observer {
    @Override
    public void update(String msg) {
        System.out.println(msg);
    }
}
