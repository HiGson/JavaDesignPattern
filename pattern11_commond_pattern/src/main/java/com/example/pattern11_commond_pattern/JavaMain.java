package com.example.pattern11_commond_pattern;

import com.example.pattern11_commond_pattern.commond_queue.CommondQueue;
import com.example.pattern11_commond_pattern.commond_receiver.CommondReceiverOne;
import com.example.pattern11_commond_pattern.commond_receiver.CommondReceiverTwo;
import com.example.pattern11_commond_pattern.iml_commond.CommondOne;
import com.example.pattern11_commond_pattern.iml_commond.CommondTwo;
import com.example.pattern11_commond_pattern.invoker.Invoker;
import com.example.pattern11_commond_pattern.invoker.ListInvoker;

/**
 * 命令模式(Command Pattern)：将一个请求封装为一个对象，从而让我们可用不同的请求对客户进行参数化；对请求排队或者记录请求日志，
 * 以及支持可撤销的操作。命令模式是一种对象行为型模式，其别名为动作(Action)模式或事务(Transaction)模式。
 *
 * 命令模式可以将请求发送者和接收者完全解耦，发送者与接收者之间没有直接引用关系，发送请求的对象只需要知道如何发送请求，而不必知道如何完成请求
 * 命令模式的本质是对请求进行封装，一个请求对应于一个命令，将发出命令的责任和执行命令的责任分割开
 * 命令模式允许请求的一方和接收的一方独立开来，使得请求的一方不必知道接收请求的一方的接口，更不必知道请求如何被接收、操作是否被执行、何时被执行，以及是怎么被执行的。
 * 命令模式的关键在于引入了抽象命令类，请求发送者针对抽象命令类编程，只有实现了抽象命令类的具体命令才与请求接收者相关联。
 *
 * 对于请求发送者即调用者而言，将针对抽象命令类进行编程，可以通过构造注入或者设值注入的方式在运行时传入具体命令类对象，并在业务方法中调用命令对象的execute()方法
 *
 * 几个重要的成员：命令对象接口、命令对象实例、命令接受者、命令发送者
 */
public class JavaMain {
    public static void main(String []args){

        // ************************ 一个请求发送者对应一个请求接受者 *********************

        // 实例化Receiver
        CommondReceiverOne commondReceiverOne = new CommondReceiverOne();
        CommondReceiverTwo commondReceiverTwo = new CommondReceiverTwo();

        // 实例化命令对象
        CommondOne commondOne = new CommondOne(commondReceiverOne);
        CommondTwo commondTwo = new CommondTwo(commondReceiverTwo);

        // 实例化invoker
        Invoker invoker = new Invoker();
        invoker.setCommond(commondOne);
        invoker.invoke();

        invoker.setCommond(commondTwo);
        invoker.invoke();


        // *********************** 一个请求发送者对应多个请求接受者 *********************
        CommondQueue commondQueue = new CommondQueue();
        commondQueue.addCommond(commondOne);
        commondQueue.addCommond(commondTwo);

        ListInvoker listInvoker = new ListInvoker();
        listInvoker.setCommondQueue(commondQueue);

        listInvoker.listInvoke();
    }
}
