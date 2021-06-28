package gdit.student_management.service.impl;

import gdit.student_management.base.result.Results;
import gdit.student_management.dao.DormitoryinfoDao;
import gdit.student_management.model.Dormitoryinfo;
import gdit.student_management.service.DormitoryinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DormitoryinfoServiceImpl implements DormitoryinfoService {
    @Autowired
    DormitoryinfoDao dormitoryinfoDao;

    @Override
    public Results getAllDormitory(int offset,int num){
        int count=dormitoryinfoDao.count();
        return Results.success(count,dormitoryinfoDao.getAllDormitory(offset, num));
    }

    @Override
    public int addDormitory(Dormitoryinfo dormitoryinfo) {
        return dormitoryinfoDao.addDormitory(dormitoryinfo);
    }

    @Override
    public Dormitoryinfo findDormitoryById(Integer did) {
        Dormitoryinfo s = dormitoryinfoDao.findDormitoryById(did);
        return  s;
    }


    @Override
    public Results update(Dormitoryinfo dormitoryinfo) {
        return Results.success(dormitoryinfoDao.update(dormitoryinfo));
    }

    @Override
    public Results delete(int did) {
        return Results.success(dormitoryinfoDao.delete(did));
    }

    @Override
    public Results getSearchDormitory(String did, int offset, int num) {
        return Results.success(dormitoryinfoDao.getSearchDormitoryCount(did).intValue(),dormitoryinfoDao.getSearchDormitory(did, offset, num));
    }
}
