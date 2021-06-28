package gdit.student_management.controller;

import gdit.student_management.base.result.PageTableRequest;
import gdit.student_management.base.result.Results;
import gdit.student_management.model.Sclass;
import gdit.student_management.service.SclassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/class")
public class SclassController {
    @Autowired
    SclassService sclassServiceImpl;
    @RequestMapping("/list")
    @ResponseBody
    public Results list(int page, int limit) {
        int offset = (page - 1) * limit;//offset表示从第几条记录开始，linmit表示显示多少行
        return sclassServiceImpl.getAllClass(offset, limit);
    }
    /*更新*/
    @GetMapping("/update")
    public String upadte(){return  "/class/updateList";}

    @RequestMapping("/update")
    @ResponseBody
    public Results update(@RequestBody Sclass sclass){ return sclassServiceImpl.update(sclass);}

    /*删除*/
    @RequestMapping("/delete")
    @ResponseBody
    public Results delete(int cid){return  sclassServiceImpl.delete(cid);}

    /*搜索*/
    @RequestMapping("/search")
    @ResponseBody
    public Results<Sclass> getSearchStudentCount(PageTableRequest requests, String cid){
        requests.countOffset();
        return  sclassServiceImpl.getSearchClass(cid, requests.getOffset(), requests.getLimit());
    }

    @RequestMapping(value = "/add" ,method = RequestMethod.POST)
    @ResponseBody
    public String addStudent(@RequestBody Sclass sclass) {
        int s = sclassServiceImpl.addClass(sclass);
        return "/class/class";
    }
}
