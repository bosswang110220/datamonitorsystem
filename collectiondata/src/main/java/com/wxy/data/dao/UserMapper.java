package com.wxy.data.dao;


import com.wxy.data.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: WangYN
 * Date: 2018/7/12
 * Time: 22:55
 * To change this template use File | Settings | File Templates.
 * Description:
 */


@Repository
public interface UserMapper {

    User getUserById(Integer id);

    public List<User> getUserList();

    public int add(User user);

    public int update(@Param("id") Integer id, @Param("user") User user);

    public int delete(Integer id);

}