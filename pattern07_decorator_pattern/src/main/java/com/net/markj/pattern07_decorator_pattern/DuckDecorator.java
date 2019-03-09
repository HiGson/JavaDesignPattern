package com.net.markj.pattern07_decorator_pattern;

/**
 * Created by Kron Xu on 2019/3/10 0:15
 * Description:
 */
public class DuckDecorator extends BirdDecorator {
    public DuckDecorator(Bird bird) {
        super(bird);
    }

    @Override
    public void showFunction() {
        this.getBird().showFunction();
        canSwim();
    }

    private void canSwim(){
        System.out.println("会游泳");
    }
}
