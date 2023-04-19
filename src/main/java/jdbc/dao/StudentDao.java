package jdbc.dao;

import jdbc.model.Student;

import java.util.List;

public interface StudentDao {
    void createStudentTable();
    void saveStudent(String name, String lastName, int year);
    List<Student> getAllStudent();
    void removeStudentById(long id);
}
