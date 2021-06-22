package gdit.student_management.controller;

import gdit.student_management.base.result.Results;
import gdit.student_management.model.Dict;
import gdit.student_management.model.Report;
import gdit.student_management.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/report")
public class ReportController {
    @Autowired
    ReportService reportServiceImpl;
    @RequestMapping("/list")
    @ResponseBody
    public Results list(int page, int limit) {
        int offset = (page - 1) * limit;//offset表示从第几条记录开始，linmit表示显示多少行

        return reportServiceImpl.getAllReports(offset, limit);
    }

    @RequestMapping("/add")
    public ModelAndView add(ModelAndView mv){
        //获取数据字典的数据集合dict
        Map<String, List<Dict>> dict=reportServiceImpl.getDictSet();
        System.out.println("test"+dict);
        //把获取到的dict传到/report/add.html页面
        mv.addObject("dict",dict);
        //设置转向的视图名称
        mv.setViewName("report/addReport");
        return  mv;
    }

    @RequestMapping("/save")
    //@ResponseBody传回json格式的数据；@RequestBody获取json格式的数据
    @ResponseBody
    public int save(@RequestBody Report report){
        //调用业务层对象sysReportServiceImpl的addReport方法，增加一条记录
        return reportServiceImpl.addReport(report);
    }
}
