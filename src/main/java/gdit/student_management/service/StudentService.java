package gdit.student_management.service;

import gdit.student_management.base.result.Results;
import gdit.student_management.model.Student;

public interface StudentService {
    Results getAllStudents(int offset,int num);
    int addStudent(Student student);
    Student findStudentById(Integer sid);
    Results update(Student student);
    Results delete(int sid);
    Results getSearchStudent(String sid, int offset, int num);
    Results countSex();
    int count();
}
