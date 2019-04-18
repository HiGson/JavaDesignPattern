package com.example.pattern11_commond_pattern.invoker;

import com.example.pattern11_commond_pattern.inter_commond.Commond;

/**
 * Created by kronx on 2019/4/19 0:57
 * Description: 发送请求者只需要持有命令对象发送命令即可，不需要去直接调用Reviver的方法
 */
public class Invoker {
    private Commond commond;

    public Invoker(){}
    public Invoker(Commond commond){
        this.commond = commond;
    }

    public void setCommond(Commond commond){
        this.commond = commond;
    }

    public void invoke(){
        commond.excute();
    }
}
