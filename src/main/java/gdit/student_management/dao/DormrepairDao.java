package gdit.student_management.dao;

import gdit.student_management.model.Dormrepair;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DormrepairDao {
    @Select("select *  from  dormrepair limit #{offset},#{num}")
    List<Dormrepair> getAllDormrepair(int offset, int num);
    @Select("select count(*) from dormrepair")
    int count();
    @Insert("insert into dormrepair(did,ddormbuilding,rname,reason,create_time) values(#{did},#{ddormbuilding},#{rname},#{reason},now())")
    int addDormrepair(Dormrepair dormrepair);
    @Select("select * from dormrepair where rid=#{rid}")
    Dormrepair findDormrepairById(Integer rid);
}
