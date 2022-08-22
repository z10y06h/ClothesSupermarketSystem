package com.vince.utils;

import com.vince.bean.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserIo{


    private static List<User> users = new ArrayList<>();
    private static final String USER_FILE = "user.obj";

    //读取用户和写入用户
    public boolean writeUsers() throws BusinessException {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(USER_FILE));
            out.writeObject(users);
            out.close();
        } catch (IOException e) {

            throw new BusinessException("io.write.error");
        }
        return true;


    }

    public boolean readUser() throws BusinessException {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(USER_FILE));
            users = (List<User>) in.readObject();
            in.close();
            return true;
        } catch (IOException | ClassNotFoundException e) {
            throw new BusinessException("io.read.error");
        }

    }


    public void add(User user) {
        user.setId(users.size() + 1);
        users.add(user);
    }

    public User findByUsernamePassword(String name, String password) {
        for (User u : users) {
            if (u.getUsername().equals(name) && u.getPassword().equals(password)) {
                return u;
            }
        }
        return null;
    }


}