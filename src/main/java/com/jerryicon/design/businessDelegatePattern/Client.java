package com.jerryicon.design.businessDelegatePattern;

/**
 * @author JerryIcon
 * @date 2024/7/9 上午10:30
 */
public class Client {

    BusinessDelegate businessDelegate;

    public Client(BusinessDelegate businessDelegate){
        this.businessDelegate = businessDelegate;
    }

    public void doTask(){
        businessDelegate.doTask();
    }
}
