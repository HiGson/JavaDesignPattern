package com.net.markj.pattern07_decorator_pattern;

/**
 * Created by Kron Xu on 2019/3/10 0:25
 * Description:
 */
public class WildGooseDecorator extends BirdDecorator {
    public WildGooseDecorator(Bird bird) {
        super(bird);
    }

    @Override
    public void showFunction() {
        this.getBird().showFunction();
        this.canFly();
    }

    private void canFly(){
        System.out.println("会飞");
    }
}
