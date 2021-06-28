package gdit.student_management.service.impl;

import gdit.student_management.base.result.Results;
import gdit.student_management.dao.SclassDao;
import gdit.student_management.model.Sclass;
import gdit.student_management.service.SclassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SclassServiceImpl implements SclassService {
    @Autowired
    SclassDao sclassDao;
    @Override
    public Results getAllClass(int offset, int num) {
        int count= sclassDao.count();
        return Results.success(count, sclassDao.getAllClass( offset,num));
    }

    @Override
    public int addClass(Sclass sclass) {
        return sclassDao.addClass(sclass);
    }

    @Override
    public Sclass findClassById(Integer cID) {
        Sclass s = sclassDao.findClassById(cID);
        return s;
    }

    @Override
    public Results update(Sclass sclass) {
        return Results.success(sclassDao.update(sclass));
    }

    @Override
    public Results delete(int cID) {
        return Results.success(sclassDao.delete(cID));
    }

    @Override
    public Results getSearchClass(String cID, int offset, int num) {
        return Results.success(sclassDao.getSearchClassCount(cID).intValue(),sclassDao.getSearchClass(cID, offset, num));
    }
}
