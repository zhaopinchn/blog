package com.blog.dao;

import com.blog.entity.Role;
import com.blog.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by zhaopin on 2016/11/13.
 */
@Mapper
public interface UserMapper {

    @Select("select * from user where username = #{userName}")
    User findByUserName(@Param("userName") String userName);

    @Select("select r.* from role r left join user_role ur on r.id = ur.role where ur.user = #{userId}")
    List<Role> findUserRoles(@Param("userId") Long userId);
}
