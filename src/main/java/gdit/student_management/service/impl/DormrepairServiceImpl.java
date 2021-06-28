package gdit.student_management.service.impl;

import gdit.student_management.base.result.Results;
import gdit.student_management.dao.DormrepairDao;
import gdit.student_management.model.Dormrepair;
import gdit.student_management.service.DormrepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DormrepairServiceImpl implements DormrepairService {
    @Autowired
    DormrepairDao dormrepairDao;
    @Override
    public Results getAllDormrepair(int offset,int num){
        int count=dormrepairDao.count();
        return Results.success(count,dormrepairDao.getAllDormrepair(offset, num));
    }

    @Override
    public int addDormrepair(Dormrepair dormrepair) {
        return dormrepairDao.addDormrepair(dormrepair);
    }

    @Override
    public Dormrepair findDormrepairById(Integer oid) {
        Dormrepair s = dormrepairDao.findDormrepairById(oid);
        return  s;
    }
}
