package com.itheima.service;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import org.junit.Test;
import java.io.IOException;
import java.util.List;

public class UserService {
    @Test
    public void serviceTest() throws IOException {
       //创建dao对象 手动创建
        UserDao userDao = new UserDao();
        List<User> all = userDao.findAll();
        System.out.println(all);

    }
}
