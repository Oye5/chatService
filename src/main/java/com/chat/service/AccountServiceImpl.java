package com.chat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chat.dao.AccountDao;
import com.chat.model.Accounts;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDao accountDao;

	@Override
	public Accounts getAccountByAuthToken(String authToken) {
		return accountDao.getAccountByAuthToken(authToken);

	}

}
