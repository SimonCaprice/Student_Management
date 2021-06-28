package gdit.student_management.controller;

import gdit.student_management.base.result.PageTableRequest;
import gdit.student_management.base.result.Results;
import gdit.student_management.model.Dormitoryinfo;
import gdit.student_management.service.DormitoryinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/dormitory")
public class DormitoryinfoController {
    @Autowired
    DormitoryinfoService dormitoryinfoServiceImpl;
    @RequestMapping("/list")
    @ResponseBody
    public Results list(int page, int limit) {
        int offset = (page - 1) * limit;//offset表示从第几条记录开始，linmit表示显示多少行
        return dormitoryinfoServiceImpl.getAllDormitory(offset, limit);
    }
    /*更新*/
    @GetMapping("/update")
    public String upadte(){return  "/dormitory/updateList";}

    @RequestMapping("/update")
    @ResponseBody
    public Results update(@RequestBody Dormitoryinfo dormitory){ return dormitoryinfoServiceImpl.update(dormitory);}

    /*删除*/
    @RequestMapping("/delete")
    @ResponseBody
    public Results delete(int did){return  dormitoryinfoServiceImpl.delete(did);}

    /*搜索*/
    @RequestMapping("/search")
    @ResponseBody
    public Results<Dormitoryinfo> getSearchDormitoryCount(PageTableRequest requests, String sid){
        requests.countOffset();
        return  dormitoryinfoServiceImpl.getSearchDormitory(sid, requests.getOffset(), requests.getLimit());
    }

    @RequestMapping(value = "/add" ,method = RequestMethod.POST)
    @ResponseBody
    public String addDormitory(@RequestBody Dormitoryinfo dormitoryinfo) {
        int s = dormitoryinfoServiceImpl.addDormitory(dormitoryinfo);
        return "/dormitory/dormitory";
    }
}
