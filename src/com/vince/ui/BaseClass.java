package com.vince.ui;


import com.vince.bean.User;

import java.util.ResourceBundle;
import java.util.Scanner;

public abstract class BaseClass {
    protected static Scanner input = new Scanner(System.in);//
    protected static User currUser;//当前登陆的用户对象
    private static ResourceBundle r = ResourceBundle.getBundle("com.vince.res.r_temp");//读取


    public static String getString(String key){
        return r.getString(key);
    }

    //封装一个打印的方法，主要是为了简单一点，后面不需要一直syout。
    public static void println(String s){
        System.out.println(s);
    }
    public static void print(String s){
        System.out.println(s);
    }
}
