package gdit.student_management.service.impl;

import gdit.student_management.dao.UserDao;
import gdit.student_management.model.User;
import gdit.student_management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public User getPwd(String username) {
        return userDao.getPwd(username);
    }
}
