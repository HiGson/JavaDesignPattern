package com.net.markj.pattern07_decorator_pattern;

/**
 * Created by Kron Xu on 2019/3/10 0:41
 * Description:
 */
public class ParrotDecorator extends BirdDecorator {
    public ParrotDecorator(Bird bird) {
        super(bird);
    }

    @Override
    public void showFunction() {
        this.getBird().showFunction();
        canTalk();
    }

    private void canTalk(){
        System.out.println("会说话");
    }
}
