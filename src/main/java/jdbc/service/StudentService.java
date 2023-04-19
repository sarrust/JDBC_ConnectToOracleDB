package jdbc.service;

import jdbc.model.Student;

import java.util.List;

public interface StudentService {
    void createStudentTable();
    void saveStudent(String name, String lastName, int year);
    List<Student> getAllStudent();
    void removeStudentById(long id);
}
