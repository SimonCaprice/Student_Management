package gdit.student_management.service;

import gdit.student_management.base.result.Results;
import gdit.student_management.model.Dormitoryinfo;


public interface DormitoryinfoService {
    Results getAllDormitory(int offset, int num);
    int addDormitory(Dormitoryinfo dormitoryinfo);
    Dormitoryinfo findDormitoryById(Integer did);
    Results update(Dormitoryinfo dormitoryinfo);
    Results delete(int did);
    Results getSearchDormitory(String did, int offset, int num);
}
