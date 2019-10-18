package com.codegym.Dao;

import com.codegym.model.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;
    static{
        users = new ArrayList<>();
        User u1 =new User();
        u1.setAge(10);
        u1.setName("hieu");
        u1.setAccount("Doan");
        u1.setEmail("doanhieu.@gmail");
        u1.setPassword("12345");
        users.add(u1);

        User u2 = new User();
        u2.setAge(15);
        u2.setName("AnhChinh");
        u2.setAccount("bill");
        u2.setEmail("Chinh@codegym.vn");
        u2.setPassword("123456");
        users.add(u2);

        User u3 = new User();
        u3.setAge(16);
        u3.setName("Thanh");
        u3.setAccount("cc");
        u2.setEmail("Thanh@codegym.vn");
        u3.setPassword("123456");
        users.add(u3);

    }
    public  User checkLogin(Login login){
        for (User u: users){
            if(u.getAccount().equals(login.getAccount()) &&
                    u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}
