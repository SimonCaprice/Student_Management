package gdit.student_management.dao;

import gdit.student_management.model.Dict;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DictDao {
    @Select("select * from dict where dict_type=#{type}")
    List<Dict> getDict(String type);
}
