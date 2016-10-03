package com.chat.service;

import com.chat.model.Accounts;


public interface AccountService {

	Accounts getAccountByAuthToken(String authToken);

}
