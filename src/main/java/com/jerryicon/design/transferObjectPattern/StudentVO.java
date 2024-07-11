package com.jerryicon.design.transferObjectPattern;

/**
 * @author JerryIcon
 * @date 2024/7/10 下午5:32
 */
public class StudentVO {

    private String name;

    private int rollNo;

    public StudentVO(String name, int rollNo){
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
