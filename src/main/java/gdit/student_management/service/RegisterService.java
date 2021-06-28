package gdit.student_management.service;

import gdit.student_management.base.result.Results;
import gdit.student_management.model.Register;


public interface RegisterService {
    Results getAllRegister(int offset, int num);
    int addRegister(Register register);
    Register findRegisterById(Integer oid);
}
