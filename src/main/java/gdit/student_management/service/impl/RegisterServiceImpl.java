package gdit.student_management.service.impl;

import gdit.student_management.base.result.Results;
import gdit.student_management.dao.RegisterDao;
import gdit.student_management.model.Register;
import gdit.student_management.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    RegisterDao registerDao;
    @Override
    public Results getAllRegister(int offset, int num){
        int count=registerDao.count();
        return Results.success(count,registerDao.getAllRegister(offset, num));
    }

    @Override
    public int addRegister(Register register) {
        return registerDao.addRegister(register);
    }

    @Override
    public Register findRegisterById(Integer oid) {
        Register s = registerDao.findRegisterById(oid);
        return  s;
    }
}


