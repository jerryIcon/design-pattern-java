package com.jerryicon.design.transferObjectPattern;

/**
 * @author JerryIcon
 * @date 2024/7/10 下午5:36
 */
public class TransferPatternDemo {

    public static void main(String[] args) {

        StudentBO studentBO = new StudentBO();

        studentBO.getAllStudents();

        studentBO.updateStudent(new StudentVO("Jerry", 0));

        studentBO.deleteStudent(1);

        studentBO.getAllStudents();

    }
}
