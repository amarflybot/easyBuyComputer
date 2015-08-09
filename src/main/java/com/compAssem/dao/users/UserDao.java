package com.compAssem.dao.users;


import com.compAssem.model.users.User;

public interface UserDao {

	User findByUserName(String username);

}