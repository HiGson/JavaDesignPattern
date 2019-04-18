package com.example.pattern11_commond_pattern.iml_commond;

import com.example.pattern11_commond_pattern.commond_receiver.CommondReceiverOne;
import com.example.pattern11_commond_pattern.inter_commond.Commond;

/**
 * Created by kronx on 2019/4/19 0:49
 * Description:
 */
public class CommondOne implements Commond {

    private CommondReceiverOne commondReceiverOne;//持有一个命令接受者对象，对象可以采用构造方法注入或者方法注入

    public CommondOne(){ }

    // 构造方法注入
    public CommondOne(CommondReceiverOne commondReceiverOne){
        this.commondReceiverOne = commondReceiverOne;
    }

    // 方法注入
    public void setCommondReceiverOne(CommondReceiverOne commondReceiverOne){
        this.commondReceiverOne = commondReceiverOne;
    }

    @Override
    public void excute() {
        commondReceiverOne.showReceiverOneMessage();
    }
}
