package com.vince.ui;

import com.vince.bean.User;
import com.vince.utils.BusinessException;
import com.vince.utils.UserIo;

public class WelcomeClass extends BaseClass{



    public void start(){
        println(getString("info.welcome"));
        UserIo userIo = new UserIo();
        userIo.readUser();
        boolean flag = true;
        while(flag){
            println(getString("info.login.reg"));
            println(getString("info.select"));
            String s = input.nextLine();
            switch(s){
                case"1":

                    try{
                        new LoginClass().login();
                        flag = false;
                        println(getString("login.success" ));
                    }catch (BusinessException e){
                        println(getString(e.getMessage()));
                    }
                    break;
                case"2":
                   try {
                       new RegisterClass().register();
                       println(getString("reg.success"));
                       flag = false;
                   }catch(BusinessException e){
                       println(getString("reg.error"));
                   }



                    break;
                default:
                    println(getString("input.error"));
                    break;





            }

        }
    }

}
