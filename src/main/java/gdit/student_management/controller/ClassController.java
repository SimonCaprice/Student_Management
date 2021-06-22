package gdit.student_management.controller;

import gdit.student_management.base.result.Results;
import gdit.student_management.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/class")
public class ClassController {
    @Autowired
    ClassService classServiceImpl;
    @RequestMapping("/list")
    @ResponseBody
    public Results list(int page,int limit){
        int offset = (page - 1) * limit;
        return  classServiceImpl.getAllClass(offset,limit);
    }
}
