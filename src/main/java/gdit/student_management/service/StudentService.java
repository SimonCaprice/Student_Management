package gdit.student_management.service;

import gdit.student_management.base.result.Results;
import gdit.student_management.model.Student;

public interface StudentService {
    Results getAllStudents(int offset,int num);
    int save(Student student);
    Results update(Student student);
    Results delete(int sid);
    Results getSearchStudent(String sid, int offset, int num);
}
