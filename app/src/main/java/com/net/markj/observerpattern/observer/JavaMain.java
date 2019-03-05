package com.net.markj.observerpattern.observer;

import com.net.markj.observerpattern.observer.iml.PoliceObsever;
import com.net.markj.observerpattern.observer.iml.ThiefObservable;

/**
 * Created by Kron Xu on 2019/3/6 1:19
 * Description:
 */
public class JavaMain {
    public static void main(String []args){
        ThiefObservable thiefObservable = new ThiefObservable();

        PoliceObsever policeObsever1 = new PoliceObsever();
        PoliceObsever policeObsever2 = new PoliceObsever();
        PoliceObsever policeObsever3 = new PoliceObsever();

        thiefObservable.addObserver(policeObsever1);
        thiefObservable.addObserver(policeObsever2);
        thiefObservable.addObserver(policeObsever3);

        thiefObservable.notifyObserver("我要偷东西了，可惜你们抓不到我   O(∩_∩)O哈哈~");

    }
}
