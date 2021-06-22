package gdit.student_management.dao;

import gdit.student_management.model.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentDao {
    @Select("select *  from  student limit #{offset},#{num}")
    List<Student> getAllStudents(int offset, int num);
    @Select("select count(*) from student")
    int count();
//    @Select("select * from student where sid=#{sid}")
//    Student getBySid(int sid);
    @Insert("insert into student(sid,sname,sage,ssex,snativeplace,smajor,sclass,snative) values(#{sid},#{sname},#{sage},#{ssex},#{snativeplace},#{smajor},#{sclass},#{snative})")
    int save(Student student);
    @Select("select count(*) from student t where t.sid like '%${sid}%'")
    Long getSearchStudentCount( String sid);
    @Select("select * from student t where t.sid like '%${sid}%' limit #{offset},#{num}")
    List<Student> getSearchStudent(String sid, int offset, int num);
    @Update("UPDATE student set sname=#{sname},sage=#{sage},ssex=#{ssex},snativeplace=#{snativeplace},smajor=#{smajor},sclass=#{sclass},snative=#{snative} WHERE (sid=#{sid}) limit 1")
    int update(Student student);
    @Delete("delete from student where sid=#{sid}")
    int delete(int sid);
}
