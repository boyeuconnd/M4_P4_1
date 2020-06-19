package com.codegym.dao;

import com.codegym.model.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;
    static {
        users = new ArrayList<>();
        users.add(new User("dangpham","1234","Pham Hai Dang","abc@gmail.com",27)) ;
        users.add(new User("admin","1234","admin","admin@gmail.com",18)) ;
        users.add(new User("hieule","1234","Lê Hiếu","hieule@gmail.com",23)) ;
    }

    public static User checkLogin(Login login){
        for(User u:users){
            if(u.getAccount().equalsIgnoreCase(login.getAccount())
            && u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }

}
