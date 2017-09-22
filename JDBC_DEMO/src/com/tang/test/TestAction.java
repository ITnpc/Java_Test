package com.tang.test;

import com.tang.action.GoddessAction;
import com.tang.model.Goddess;

import java.util.*;

public class TestAction {

    public static void main(String[] args) throws Exception {
        GoddessAction action = new GoddessAction();

//

        Goddess g= new Goddess();
        g.setUser_name("小青1");
        g.setAge(23);
        g.setSex(1);
        g.setBirthday(new Date());
        g.setEmail("xiaoqing@123.com");
        g.setMobile("15099992221");
        g.setIsdel(0);
//        g.setId(6);

//        action.add(g);
//        action.edit(g);
//        action.del(7);

        List<Map<String, Object>> params = new ArrayList<Map<String, Object>>();
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("name", "user_name");
        param.put("rela", "=");
        param.put("value", "'小青'");
        params.add(param);

        List<Goddess> result = action.query(params);
        for(int i=0; i<result.size(); i++){
            System.out.println(result.get(i).getId() + " : " + result.get(i).getUser_name());
        }
    }
}
