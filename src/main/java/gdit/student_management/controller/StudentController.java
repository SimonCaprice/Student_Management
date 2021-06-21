package gdit.student_management.controller;

import gdit.student_management.base.result.PageTableRequest;
import gdit.student_management.base.result.Results;

import gdit.student_management.model.Dict;
import gdit.student_management.model.Student;
import gdit.student_management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentImpl;
    @RequestMapping("/list")
    @ResponseBody
    public Results list(int page, int limit) {
        int offset = (page - 1) * limit;//offset表示从第几条记录开始，linmit表示显示多少行
        return studentImpl.getAllStudents(offset, limit);
    }
    @GetMapping("/update")
    public String upadte(){return  "/student/updateList";}

    @RequestMapping("/update")
    @ResponseBody
    public Results update(@RequestBody  Student student){ return studentImpl.update(student);}

    @RequestMapping("/delete")
    @ResponseBody
    public Results delete(int sid){return  studentImpl.delete(sid);}

    @RequestMapping("/search")
    @ResponseBody
    public Results<Student> getSearchStudentCount(PageTableRequest requests,String sid){
        requests.countOffset();
        return  studentImpl.getSearchStudent(sid, requests.getOffset(), requests.getLimit());
    }

    @RequestMapping(value = "/add" ,method = RequestMethod.POST)
    @ResponseBody
    public String add( @RequestBody Student student) {
        return "/student/student";
    }

}
