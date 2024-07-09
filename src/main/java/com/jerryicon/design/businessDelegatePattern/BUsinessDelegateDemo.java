package com.jerryicon.design.businessDelegatePattern;

/**
 * @author JerryIcon
 * @date 2024/7/9 上午10:30
 */
public class BUsinessDelegateDemo {
    public static void main(String[] args) {

        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();

    }
}
