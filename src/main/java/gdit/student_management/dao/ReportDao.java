package gdit.student_management.dao;

import gdit.student_management.model.Report;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ReportDao {
    @Select("select *  from  report limit #{offset},#{num}")
    List<Report> getAllReports(int offset, int num);
    @Select("select count(*) from report")
    int count();
    @Insert("insert into report(createTime,applicant,ssex,sclass,snumber,reason,duration,description)"+
            "values(now(),#{applicant},#{ssex},#{sclass},#{snumber},#{reason},#{duration},#{description})")
            int save(Report report);
}
