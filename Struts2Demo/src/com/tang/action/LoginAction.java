package com.tang.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.tang.po.User;

public class LoginAction extends ActionSupport implements ModelDriven<User> {

    private User user = new User();

    public String login(){

        if(user.getUsername()==null || "".equals(user.getUsername())){
            this.addFieldError("username", "用户名不能为空");
            return INPUT;
        }

        System.out.println(user.getUsername());
        System.out.println(user.getBookList().get(0).getUsername());
        System.out.println(user.getBookList().get(1).getUsername());

        return SUCCESS;
    }

    @Override
    public User getModel() {
        return user;
    }
}
