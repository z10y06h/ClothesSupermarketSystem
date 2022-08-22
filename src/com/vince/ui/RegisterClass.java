package com.vince.ui;

import com.vince.bean.User;
import com.vince.service.UserService;
import com.vince.service.impl.UserServiceImpl;
import com.vince.utils.BusinessException;

public class RegisterClass extends BaseClass{
    //接受账号密码
    public void register () throws BusinessException {
        print(getString("input.username"));
        String username = input.nextLine();
        println(getString("input.password"));
        String password = input.nextLine();

        User user = new User(username, password);

        UserServiceImpl userService = new UserServiceImpl();
        userService.register(user);
    }
}
