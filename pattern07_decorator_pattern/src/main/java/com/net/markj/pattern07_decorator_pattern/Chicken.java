package com.net.markj.pattern07_decorator_pattern;

/**
 * Created by Kron Xu on 2019/3/10 0:09
 * Description:
 */
public class Chicken implements Bird {
    @Override
    public void canRun() {
        System.out.println("会跑");
    }

    @Override
    public void showFunction() {
        canRun();
    }
}
