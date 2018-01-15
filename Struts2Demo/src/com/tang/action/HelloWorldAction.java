package com.tang.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;


public class HelloWorldAction extends ActionSupport {

    private HttpServletRequest request = ServletActionContext.getRequest();
    public String add(){
        request.setAttribute("path", "update");
        return "add";
    }

    public String update(){
        return "update";
    }

    @Override
    public String execute() throws Exception{
        System.out.println("执行Action");
        return SUCCESS;
    }
}
