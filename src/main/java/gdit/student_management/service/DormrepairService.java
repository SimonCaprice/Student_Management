package gdit.student_management.service;

import gdit.student_management.base.result.Results;
import gdit.student_management.model.Dormrepair;


public interface DormrepairService {
    Results getAllDormrepair(int offset, int num);
    int addDormrepair(Dormrepair dormrepair);
    Dormrepair findDormrepairById(Integer rid);
}
