package com.chat.dao;

import com.chat.model.Accounts;


public interface AccountDao {
	Accounts getAccountByAuthToken(String authToken);

}
