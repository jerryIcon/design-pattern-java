package com.jerryicon.design.filterPattern;

/**
 * @author JerryIcon
 * @date 2024/7/4 下午4:46
 */
public class Person {

    private String name;

    private String gender;

    private String maritalStatus;

    public Person(String name, String gender, String maritalStatus){
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public String getName() {
        return name;
    }
}
