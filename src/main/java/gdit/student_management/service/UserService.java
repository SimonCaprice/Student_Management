package gdit.student_management.service;

import gdit.student_management.base.result.Results;
import gdit.student_management.model.User;

public interface UserService {
    User getPwd(String username);
    Results getAllUser (int offset, int num);
}
