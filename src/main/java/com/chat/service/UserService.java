package com.chat.service;

import com.chat.model.User;

public interface UserService {

	void saveUser(User user);

	User getUser(String email);

	void updateUser(User user);
}
