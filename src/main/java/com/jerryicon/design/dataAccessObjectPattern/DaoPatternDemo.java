package com.jerryicon.design.dataAccessObjectPattern;

/**
 * @author JerryIcon
 * @date 2024/7/9 上午11:37
 */
public class DaoPatternDemo {
    public static void main(String[] args) {
        StudentDaoImpl studentDao = new StudentDaoImpl();

        for(Student student : studentDao.getAllStudents()){
            System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + "]");
        }

        Student student = studentDao.getAllStudents().get(0);
        student.setName("Micheal");
        studentDao.updateStudent(student);

        studentDao.getStudent(0);
        System.out.println("Student：[RollNo : " + student.getRollNo() + ", Name : " + student.getName() + "]");

    }
}
