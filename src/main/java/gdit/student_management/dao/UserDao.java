package gdit.student_management.dao;

import gdit.student_management.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao {
    /*登录*/
    @Select("select username,password from user where username=#{username}")
    public User getPwd(String username);
    @Select("select * from user limit #{offset},#{num}")
    List<User> getAllUser(int offset,int num);
    @Select("select count(*) from  user")
    int count();

}
