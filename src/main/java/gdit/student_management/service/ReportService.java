package gdit.student_management.service;

import gdit.student_management.base.result.Results;
import gdit.student_management.model.Dict;
import gdit.student_management.model.Report;

import java.util.List;
import java.util.Map;

public interface ReportService {
    Results getAllReports(int offset,int num);
    int addReport(Report report);


    Map<String, List<Dict>> getDictSet();
}
