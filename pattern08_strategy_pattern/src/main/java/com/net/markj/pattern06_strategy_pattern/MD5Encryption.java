package com.net.markj.pattern06_strategy_pattern;

/**
 * Created by Kron Xu on 2019/3/10 1:40
 * Description:
 */
public class MD5Encryption implements Encryption {
    @Override
    public void encrypt() {
        System.out.println("使用MD5加密");
    }
}
