package jdbc.service;

import jdbc.dao.StudentDao;
import jdbc.dao.StudentDaoJDBC;
import jdbc.model.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    StudentDao studentDao = new StudentDaoJDBC();
    public void createStudentTable() {
        studentDao.createStudentTable();
    }
    public void saveStudent(String name, String lastName, int year) {
        studentDao.saveStudent(name, lastName, year);
    }
    public List<Student> getAllStudent() {
        List<Student> students = studentDao.getAllStudent();
        for(Student student : students) {
            System.out.println(student);
        }
        return students;
    }
    public void removeStudentById(long id) {
        studentDao.removeStudentById(id);
    }
}
