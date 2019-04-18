package com.example.pattern11_commond_pattern.commond_queue;

import com.example.pattern11_commond_pattern.inter_commond.Commond;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kronx on 2019/4/19 1:13
 * Description:命令使用一个命令队列来维护
 */
public class CommondQueue {
    List<Commond> commondList = new ArrayList<>();
    public CommondQueue(){}
    public CommondQueue(List<Commond> list){
        this.commondList = list;
    }

    public void addCommond(Commond commond){
        commondList.add(commond);
    }

    public void removeCommong(Commond commond){
        if (commondList.size() > 0 && commondList.contains(commond)){
            commondList.remove(commond);
        }
    }

    public void excuteCommondQueue(){
        while (commondList.size() > 0){
            commondList.get(0).excute();
            commondList.remove(0);
        }
    }
}
