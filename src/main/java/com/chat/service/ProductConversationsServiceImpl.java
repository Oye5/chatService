package com.chat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chat.dao.ProductConversationsDao;
import com.chat.model.ProductChat;
import com.chat.model.ProductConversations;

@Service
@Transactional
public class ProductConversationsServiceImpl implements ProductConversationsService {

	@Autowired
	ProductConversationsDao convDao;

	@Override
	public ProductConversations saveMessages(ProductConversations conv) {
		return convDao.saveMessages(conv);
	}

	@Override
	public List<ProductConversations> getConversationById(String chatId) {
		return convDao.getConversationById(chatId);
	}

	@Override
	public void deleteConversations(List<ProductChat> list) {
		convDao.deleteConversations(list);

	}

	@Override
	public List<ProductConversations> getConversationsByUserId(String userId) {
		return convDao.getConversationsByUserId(userId);
	}

	@Override
	public List<ProductConversations> getConversationsByChatId(List<String> chatId) {
		return convDao.getConversationsByChatId(chatId);
	}

}
