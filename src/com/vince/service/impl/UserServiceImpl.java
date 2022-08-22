package com.vince.service.impl;

import com.vince.bean.User;
import com.vince.service.UserService;
import com.vince.utils.BusinessException;
import com.vince.utils.EmptyUtils;
import com.vince.utils.UserIo;

public class UserServiceImpl implements UserService {
    @Override
    public User register(User user) throws BusinessException {
        UserIo userIO = new UserIo();
        userIO.add(user);
        userIO.writeUsers();
        return user;

    }

    @Override
    public User login(String username, String password) throws BusinessException {
        if (EmptyUtils.isEmpty(username)){
            throw new BusinessException("username.notnull");
        }
        if (EmptyUtils.isEmpty(password)){
            throw new BusinessException("password.notnull");
        }

        UserIo userIo = new UserIo();
        User user = userIo.findByUsernamePassword(username, password);

        return user;
    }

}
