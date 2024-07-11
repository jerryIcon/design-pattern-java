package com.jerryicon.design.transferObjectPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JerryIcon
 * @date 2024/7/10 下午5:33
 */
public class StudentBO {

    private List<StudentVO> students = new ArrayList<>();

    public StudentBO(){
        students.add(new StudentVO("Robert",0));
        students.add(new StudentVO("John",1));
    }

    public void getAllStudents(){
        for (StudentVO student : students) {
            System.out.println("Student: [ Name: "+student.getName()+", RollNo: "+student.getRollNo()+" ]");
        }
    }

    public void deleteStudent(int rollNo){
        students.remove(rollNo);
        System.out.println("Student: [ Name: Robert, RollNo: 0 ] deleted from database");
    }

    public void updateStudent(StudentVO student){
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: [ Name: "+student.getName()+", RollNo: "+student.getRollNo()+" ] updated in the database");
    }

    public void addStudent(StudentVO studentVO){
        students.add(studentVO);
        System.out.println("Student: [ Name: "+studentVO.getName()+", RollNo: "+studentVO.getRollNo()+" ] added to the database");
    }
}
