package gdit.student_management.dao;

import gdit.student_management.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface UserDao {
    @Select("select username,password from user where username=#{username}")
    public User getPwd(String username);
}
