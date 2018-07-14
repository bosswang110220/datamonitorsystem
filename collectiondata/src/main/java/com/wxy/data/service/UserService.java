package com.wxy.data.service;

import com.wxy.data.entity.User;

import java.util.List;

/**
 * java类简单作用描述
 *
 * @ProjectName: datamonitorsystem
 * @Package: com.wxy.data.service
 * @ClassName: ${TYPE_NAME}
 * @Description: java类作用描述
 * @Author: 作者姓名
 * @CreateDate: 2018/7/14 12:05
 * @UpdateUser: Neil.Zhou
 * @UpdateDate: 2018/7/14 12:05
 * @UpdateRemark: The modified content
 * @Version: 1.0
 **/
public interface UserService {

    User getUserById(Integer id);

    public List<User> getUserList();

    public int add(User user);

    public int update(Integer id, User user);

    public int delete(Integer id);


}
