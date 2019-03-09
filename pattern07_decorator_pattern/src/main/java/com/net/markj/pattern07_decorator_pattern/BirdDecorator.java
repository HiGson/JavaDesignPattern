package com.net.markj.pattern07_decorator_pattern;

/**
 * Created by Kron Xu on 2019/3/10 0:10
 * Description:
 */
public abstract class BirdDecorator implements Bird {
    Bird bird;


    public BirdDecorator(Bird bird){
        this.bird = bird;
    }

    public Bird getBird() {
        return bird;
    }

    public void setBird(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void canRun() {

    }

}
