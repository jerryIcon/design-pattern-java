package com.jerryicon.design.dataAccessObjectPattern;

import java.util.List;

/**
 * @author JerryIcon
 * @date 2024/7/9 上午11:32
 */
public interface StudentDo {

    List<Student> getAllStudents();

    Student getStudent(int rollNo);

    void updateStudent(Student student);

    void deleteStudent(Student student);
}
