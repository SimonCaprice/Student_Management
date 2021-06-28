package gdit.student_management.controller;

import gdit.student_management.base.result.Results;
import gdit.student_management.model.Dormrepair;
import gdit.student_management.service.DormrepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/dormrepair")
public class DormrepairController {
    @Autowired
    DormrepairService dormrepairServiceImpl;
    @RequestMapping("/list")
    @ResponseBody
    public Results list(int page, int limit) {
        int offset = (page - 1) * limit;//offset表示从第几条记录开始，linmit表示显示多少行
        return dormrepairServiceImpl.getAllDormrepair(offset, limit);
    }
    @RequestMapping(value = "/add" ,method = RequestMethod.POST)
    @ResponseBody
    public String addDormrepair(@RequestBody Dormrepair dormrepairt) {
        int s = dormrepairServiceImpl.addDormrepair(dormrepairt);
        return "/report/addDormrepair";
    }

}
