package com.example.pattern11_commond_pattern.iml_commond;

import com.example.pattern11_commond_pattern.commond_receiver.CommondReceiverTwo;
import com.example.pattern11_commond_pattern.inter_commond.Commond;

/**
 * Created by kronx on 2019/4/19 0:49
 * Description:
 */
public class CommondTwo implements Commond {

    private CommondReceiverTwo commondReceiverTwo;//持有一个命令接受者对象，对象可以采用构造方法注入或者方法注入

    public CommondTwo(){ }

    // 构造方法注入
    public CommondTwo(CommondReceiverTwo commondReceiverTwo){
        this.commondReceiverTwo = commondReceiverTwo;
    }

    // 方法注入
    public void setCommondReceiverTwo(CommondReceiverTwo commondReceiverTwo){
        this.commondReceiverTwo = commondReceiverTwo;
    }

    @Override
    public void excute() {
        commondReceiverTwo.showReceiverTwoMessage();
    }
}
