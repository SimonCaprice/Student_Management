package gdit.student_management.service.impl;

import gdit.student_management.base.result.Results;
import gdit.student_management.dao.ClassDao;
import gdit.student_management.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassServiceImpl implements ClassService {
    @Autowired
    ClassDao classDao;
    @Override
    public Results getAllClass(int offset, int num) {
        int count=classDao.count();
        return Results.success(count, classDao.getAllClass( offset,num));
    }
}
