package com.tang.action;

import com.tang.dao.GoddessDao;
import com.tang.model.Goddess;

import java.util.Date;
import java.util.List;

public class GoddessAction {

    public static void main(String[] args) throws  Exception {

        GoddessDao g = new GoddessDao();

//        List<Goddess> gs = g.query();
//
//        for( Goddess goddess: gs){
//            System.out.println(goddess.getUser_name() + " , " + goddess.getAge());
//        }

        Goddess g1 = new Goddess();

        g1.setUser_name("小夏");
        g1.setAge(22);
        g1.setSex(1);
        g1.setBirthday(new Date());
        g1.setEmail("xiaoxia@163.com");
        g1.setMobile("18719996666");
        g1.setCreate_user("admin");
        g1.setUpdate_user("admin");
        g1.setIsdel(1);

        g.addGoddess(g1);
    }
}
