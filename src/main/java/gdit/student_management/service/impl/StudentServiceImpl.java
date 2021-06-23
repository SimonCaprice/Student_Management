package gdit.student_management.service.impl;


import gdit.student_management.base.result.ResponseCode;
import gdit.student_management.base.result.Results;
import gdit.student_management.dao.StudentDao;
import gdit.student_management.model.Student;
import gdit.student_management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentDao studentDao;
    @Override
    public Results getAllStudents(int offset,int num){
        int count=studentDao.count();
        return Results.success(count,studentDao.getAllStudents(offset, num));
    }

    @Override
    public int addStudent(Student student) {
        return studentDao.addStudent(student);
    }

    @Override
    public Student findStudentById(Integer sid) {
        Student s = studentDao.findStudentById(sid);
        return  s;
    }


    @Override
    public Results update(Student student) {
        return Results.success(studentDao.update(student));
    }

    @Override
    public Results delete(int sid) {
        return Results.success(studentDao.delete(sid));
    }

    @Override
    public Results getSearchStudent(String sid, int offset, int num) {
        return Results.success(studentDao.getSearchStudentCount(sid).intValue(),studentDao.getSearchStudent(sid, offset, num));
    }

    @Override
    public Results countSex() {
        List data=new ArrayList();
        data.add(studentDao.countSex("男"));
        data.add(studentDao.countSex("女"));
        return Results.success(ResponseCode.SUCCESS,data);
    }

    @Override
    public int count() {
        return studentDao.count();
    }

}
