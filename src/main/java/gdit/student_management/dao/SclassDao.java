package gdit.student_management.dao;


import gdit.student_management.model.Sclass;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface SclassDao {
    @Select("select *  from  sclass limit #{offset},#{num}")
    List<Sclass> getAllClass(int offset, int num);
    @Select("select count(*) from sclass")
    int count();
    @Insert("insert into sclass(cid,cfaculty,cmajor,cclass,cpeoplenumber,cheadteacher,ccontactnumber) values(#{cid},#{cfaculty},#{cmajor},#{cclass},#{cpeoplenumber},#{cheadteacher},#{ccontactnumber})")
    int addClass(Sclass sclass);
    @Select("select * from sclass where cid=#{cid}")
    Sclass findClassById(Integer cid);
    @Select("select count(*) from sclass t where t.cid like '%${cid}%'")
    Long getSearchClassCount( String cid);
    @Select("select * from sclass t where t.cid like '%${cid}%' limit #{offset},#{num}")
    List<Sclass> getSearchClass(String cid, int offset, int num);
    @Update("UPDATE sclass set cfaculty=#{cfaculty},cmajor=#{cmajor},cclass=#{cclass},cpeoplenumber=#{cpeoplenumber},cheadteacher=#{cheadteacher},ccontactnumber=#{ccontactnumber} WHERE (cid=#{cid}) limit 1")
    int update(Sclass sclass);
    @Delete("delete from sclass where cid=#{cid}")
    int delete(int cid);
}
