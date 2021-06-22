package gdit.student_management.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ClassDao {
    @Select("select *  from  class limit #{offset},#{num}")
    List<Class> getAllClass(int offset, int num);
    @Select("select count(*) from class")
    int count();

}
