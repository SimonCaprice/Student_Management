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
    /*更新*/
    @GetMapping("/update")
    public String upadte(){return  "/student/updateList";}

    @RequestMapping("/update")
    @ResponseBody
    public Results update(@RequestBody  Student student){ return studentImpl.update(student);}

    /*删除*/
    @RequestMapping("/delete")
    @ResponseBody
    public Results delete(int sid){return  studentImpl.delete(sid);}

    /*搜索*/
    @RequestMapping("/search")
    @ResponseBody
    public Results<Student> getSearchStudentCount(PageTableRequest requests,String sid){
        requests.countOffset();
        return  studentImpl.getSearchStudent(sid, requests.getOffset(), requests.getLimit());
    }

    @RequestMapping(value = "/add" ,method = RequestMethod.POST)
    @ResponseBody
    public String addStudent(@RequestBody Student student) {
        int s = studentImpl.addStudent(student);
        return "/student/student";
    }
    @RequestMapping("/getSex")
    @ResponseBody
    public Results getSex(){
        return studentImpl.countSex();
    }


}
