package gdit.student_management.dao;

import gdit.student_management.model.Dormitoryinfo;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface DormitoryinfoDao {
    @Select("select *  from  dormitoryinfo limit #{offset},#{num}")
    List<Dormitoryinfo> getAllDormitory(int offset, int num);
    @Select("select count(*) from dormitoryinfo")
    int count();
    @Insert("insert into dormitoryinfo(did,ddormbuilding,sdormitoryid,dbedtotal,dbed,aname) values(#{did},#{ddormbuilding},#{sdormitoryid},#{dbedtotal},#{dbed},#{aname})")
    int addDormitory(Dormitoryinfo dormitoryinfo);
    @Select("select * from dormitoryinfo where did=#{did}")
    Dormitoryinfo findDormitoryById(Integer did);
    @Select("select count(*) from dormitoryinfo t where t.did like '%${did}%'")
    Long getSearchDormitoryCount( String did);
    @Select("select * from dormitoryinfo t where t.did like '%${did}%' limit #{offset},#{num}")
    List<Dormitoryinfo> getSearchDormitory(String did, int offset, int num);
    @Update("UPDATE dormitoryinfo set ddormbuilding=#{ddormbuilding},sdormitoryid=#{sdormitoryid},dbedtotal=#{dbedtotal},dbed=#{dbed},aname=#{aname} WHERE (did=#{did}) limit 1")
    int update(Dormitoryinfo dormitoryinfo);
    @Delete("delete from dormitoryinfo where did=#{did}")
    int delete(int did);
}
