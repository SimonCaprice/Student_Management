package gdit.student_management.dao;


import gdit.student_management.model.Register;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RegisterDao {
    @Select("select *  from  register limit #{offset},#{num}")
    List<Register> getAllRegister(int offset, int num);
    @Select("select count(*) from register")
    int count();
    @Insert("insert into dormrepair(oid,oname,owork,ophone,oreason,createTime) values(#{oid},#{oname},#{owork},#{ophone},,#{oreason},now())")
    int addRegister(Register register);
    @Select("select * from register where oid=#{oid}")
    Register findRegisterById(Integer oid);
}
