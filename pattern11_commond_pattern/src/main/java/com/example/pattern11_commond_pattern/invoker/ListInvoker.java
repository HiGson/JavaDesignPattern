package com.example.pattern11_commond_pattern.invoker;

import com.example.pattern11_commond_pattern.commond_queue.CommondQueue;

/**
 * Created by kronx on 2019/4/19 1:13
 * Description:处理命令队列时不再对单一的Commond进行处理，而是对CommondQueue进行处理
 */
public class ListInvoker {
    private CommondQueue commondQueue;
    public ListInvoker(){}
    public ListInvoker(CommondQueue commondQueue){
        this.commondQueue = commondQueue;
    }

    public void setCommondQueue(CommondQueue commondQueue){
        this.commondQueue = commondQueue;
    }

    public void listInvoke(){
        commondQueue.excuteCommondQueue();
    }
}
