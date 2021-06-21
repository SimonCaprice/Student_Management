package gdit.student_management.service.impl;

import gdit.student_management.base.result.Results;
import gdit.student_management.dao.DictDao;
import gdit.student_management.dao.ReportDao;
import gdit.student_management.model.Dict;
import gdit.student_management.model.Report;
import gdit.student_management.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service(value = "reportServiceImpl")
public class ReportServiceImpl implements ReportService {
    @Autowired
    ReportDao reportDao;
    @Autowired
    DictDao dictDao;
    @Override
    public Results getAllReports(int offset,int num){
        int count=reportDao.count();
        return  Results.success(count,reportDao.getAllReports(offset,num));
    }

    @Override
    public int addReport(Report report) {
        return reportDao.save(report);
    }

    @Override
    public Map<String, List<Dict>> getDictSet(){
        Map<String,List<Dict>> dict =new HashMap<>();
        dict.put("ssex", new ArrayList<>());
        dict.put("reason", new ArrayList<>());
        dict.put("duration", new ArrayList<>());
        List<Dict> dictList = dictDao.getDict("");
        dictList = dictDao.getDict("ssex");
        for (int i = 0; i < dictList.size(); i++)
            dict.get("ssex").add(new Dict(dictList.get(i).getDictKey(), dictList.get(i).getDictValue()));

        dictList = dictDao.getDict("reason");
        for (int i = 0; i < dictList.size(); i++)
            dict.get("reason").add(new Dict(dictList.get(i).getDictKey(), dictList.get(i).getDictValue()));

        dictList = dictDao.getDict("duration");
        for (int i = 0; i < dictList.size(); i++)
            dict.get("duration").add(new Dict(dictList.get(i).getDictKey(), dictList.get(i).getDictValue()));


        return dict;
    }
}
