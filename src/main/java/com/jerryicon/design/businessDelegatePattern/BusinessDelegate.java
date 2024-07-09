package com.jerryicon.design.businessDelegatePattern;

/**
 * @author JerryIcon
 * @date 2024/7/9 上午10:26
 */
public class BusinessDelegate {

    private BusinessLookup businessLookup = new BusinessLookup();

    private BusinessService businessService;

    private String serviceType;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask(){
        businessService = businessLookup.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
