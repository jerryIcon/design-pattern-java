package com.jerryicon.design.dataAccessObjectPattern;

/**
 * @author JerryIcon
 * @date 2024/7/9 上午11:31
 */
public class Student {
    private String name;

    private int rollNo;

    public Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
