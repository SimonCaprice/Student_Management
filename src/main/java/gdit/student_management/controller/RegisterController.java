package gdit.student_management.controller;

import gdit.student_management.base.result.Results;
import gdit.student_management.model.Register;
import gdit.student_management.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("register")
public class RegisterController {
    @Autowired
    RegisterService registerServiceImpl;
    @RequestMapping("/list")
    @ResponseBody
    public Results list(int page, int limit) {
        int offset = (page - 1) * limit;//offset表示从第几条记录开始，linmit表示显示多少行
        return registerServiceImpl.getAllRegister(offset, limit);
    }
    @RequestMapping(value = "/add" ,method = RequestMethod.POST)
    @ResponseBody
    public String addDormrepair(@RequestBody Register register) {
        int s = registerServiceImpl.addRegister(register);
        return "/report/addRegister";
    }
}
