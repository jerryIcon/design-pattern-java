package com.jerryicon.design.businessDelegatePattern;

/**
 * @author JerryIcon
 * @date 2024/7/9 上午10:26
 */
public class BusinessLookup {

    public BusinessService getBusinessService(String serviceType){
        if(serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }else {
            return new JMSService();
        }
    }
}
