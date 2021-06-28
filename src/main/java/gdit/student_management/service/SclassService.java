package gdit.student_management.service;

import gdit.student_management.base.result.Results;
import gdit.student_management.model.Sclass;

public interface SclassService {
    Results getAllClass(int offset,int num);
    int addClass(Sclass sclass);
    Sclass findClassById(Integer cid);
    Results update(Sclass sclass);
    Results delete(int cid);
    Results getSearchClass(String cid,int offset,int num);

}
