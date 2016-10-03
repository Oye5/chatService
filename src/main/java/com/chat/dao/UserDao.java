package com.chat.dao;

import com.chat.model.User;

public interface UserDao {

	void saveUser(User user);

	User getUser(String email);

	void updateUser(User user);
}
