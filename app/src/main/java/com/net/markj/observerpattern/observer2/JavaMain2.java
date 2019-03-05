package com.net.markj.observerpattern.observer2;

/**
 * Created by Kron Xu on 2019/3/6 1:56
 * Description:
 */
public class JavaMain2 {
    public static void main(String []args){
        ThiefObservable2 thiefObservable2 = new ThiefObservable2();

        PoliceObserver2 policeObserver21 = new PoliceObserver2();
        PoliceObserver2 policeObserver2 = new PoliceObserver2();
        PoliceObserver2 policeObserver23 = new PoliceObserver2();

        thiefObservable2.addObserver(policeObserver21);
        thiefObservable2.addObserver(policeObserver21);
        thiefObservable2.addObserver(policeObserver2);
        thiefObservable2.addObserver(policeObserver2);
        thiefObservable2.addObserver(policeObserver23);

        thiefObservable2.notyfyObserver();
    }
}
