package com.chb.dao;

import com.chb.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface UserDao {
    List<User> selectUser();
    User selectUserById(int id);
    User selectUserByNP(@Param("username") String username,@Param("pwd") String pwd);
    User selectUserByNP2(Map<String,Object> map);
    int addUser(User user);
    int updateUser(User user);
    int deleteUser(int id);
    //选择全部用户实现分页
    List<User> selectUsers(Map<String,Integer> map);
    //通过注解的方式查询全部用户
    @Select("select id,username,password as pwd from user")
    public List<User> getAllUser();
    //根据id查询用户
    @Select("select * from user where id = #{id}")
    User selectUserByIds(int id);
    //添加一个用户
    @Insert("insert into user (id,username,password) values (#{id},#{username},#{password})")
    int addUsers(User user);
    //修改一个用户
    @Update("update user set username=#{name},password=#{pwd} where id = #{id}")
    int updateUsers(User user);
    //根据id删除用
    @Delete("delete from user where id = #{id}")
    int deleteUsers(int id);
}
