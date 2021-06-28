package gdit.student_management.controller;

import gdit.student_management.base.result.Results;
import gdit.student_management.dao.UserDao;
import gdit.student_management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userServiceImpl;
    @RequestMapping("/list")
    @ResponseBody
    public Results list(int page, int limit) {
        int offset = (page - 1) * limit;//offset表示从第几条记录开始，linmit表示显示多少行
        return userServiceImpl.getAllUser(offset, limit);
    }

}
