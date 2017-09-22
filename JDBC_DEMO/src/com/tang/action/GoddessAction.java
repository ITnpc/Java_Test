package com.tang.action;

import com.tang.dao.GoddessDao;
import com.tang.model.Goddess;

import java.sql.SQLException;
import java.util.*;

public class GoddessAction {

    public void add(Goddess goddess) throws Exception {
        GoddessDao dao = new GoddessDao();
        goddess.setSex(1);
        goddess.setCreate_user("ADMIN");
        goddess.setUpdate_user("ADMIN");
        goddess.setIsdel(0);
        dao.addGoddess(goddess);
    }

    public Goddess get(Integer id) throws Exception{
        GoddessDao dao = new GoddessDao();
        return dao.get(id);
    }

    public void edit(Goddess goddess) throws  Exception{
        GoddessDao dao = new GoddessDao();
        dao.updateGoddess(goddess);
    }

    public void del(Integer id) throws SQLException {
        GoddessDao dao = new GoddessDao();
        dao.delGoddess(id);
    }
    public List<Goddess> query() throws Exception {
        GoddessDao dao = new GoddessDao();
        return dao.query();
    }
    public List<Goddess> query(List<Map<String, Object>> params) throws Exception {
        GoddessDao dao = new GoddessDao();
        return dao.query(params);
    }

    public static void main(String[] args) throws  Exception {

        GoddessDao g = new GoddessDao();

        List<Map<String, Object>> params = new ArrayList<Map<String, Object>>();

        Map<String, Object> param = new HashMap<String, Object>();
        param.put("name", "user_name");
        param.put("rela", "like");
        param.put("value", "'%小花%'");
        params.add(param);
        param = new HashMap<String, Object>();
        param.put("name", "mobile");
        param.put("rela", "=");
        param.put("value", "'18719995555'");
        params.add(param);
        List<Goddess> result = g.query(params);
        for(int i=0; i< result.size(); i++){
            System.out.println(result.get(i).toString());
        }


        Goddess g1 = new Goddess();

        g1.setUser_name("小花");
        g1.setAge(22);
        g1.setSex(1);
        g1.setBirthday(new Date());
        g1.setEmail("xiaohua@163.com");
        g1.setMobile("18719995555");

        g1.setUpdate_user("admin");
        g1.setIsdel(1);
//        g1.setId(3);

        Goddess g2 = g.get(4);
//        System.out.println(g2.toString());
//        g.delGoddess(3);
//        g.updateGoddess(g1);

//        g.addGoddess(g1);
    }
}
