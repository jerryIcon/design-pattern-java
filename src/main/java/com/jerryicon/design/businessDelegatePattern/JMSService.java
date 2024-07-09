package com.jerryicon.design.businessDelegatePattern;

/**
 * @author JerryIcon
 * @date 2024/7/9 上午10:25
 */
public class JMSService implements BusinessService{
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
