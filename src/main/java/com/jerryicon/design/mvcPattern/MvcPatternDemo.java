package com.jerryicon.design.mvcPattern;

public class MvcPatternDemo {

    public static void main(String[] args) {

        Student student = retrieveStudentFromDatabase();

        StudentView view = new StudentView();

        StudentController controller = new StudentController(student, view);

        controller.updateView();

        controller.setStudentName("John");

        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}
